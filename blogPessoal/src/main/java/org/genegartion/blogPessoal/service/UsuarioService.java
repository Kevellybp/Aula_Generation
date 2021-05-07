package org.genegartion.blogPessoal.service;

import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Base64;
import java.util.Optional;

import org.genegartion.blogPessoal.model.UserLogin;
import org.genegartion.blogPessoal.model.Usuario;
import org.genegartion.blogPessoal.repository.UsuarioREpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {
	@Autowired
	private UsuarioREpository repository;
	public Usuario CadastrarUsuario (Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String senhaEnconder = encoder.encode (usuario.getSenha());
		usuario.setSenha(senhaEnconder);
		return repository.save(usuario);
	}
	public Optional<UserLogin> Logar (Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder ();
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		if (usuario.isPresent()) {
			if (encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				String auth = user.get().getUsuario() + ": " +user.get().getSenha();
				byte []encodeAuth = Base64.encodeBase64 (auth.getBytes(Charset.forName("US-ASCII")));
			String authHeader = "Basic " + new String (encodeAuth);
			user.get().setToken(authHeader);
			user.get().setNome(usuario.get().getNome());
			return user;
			
			}
		}
		return null;
	}

}
