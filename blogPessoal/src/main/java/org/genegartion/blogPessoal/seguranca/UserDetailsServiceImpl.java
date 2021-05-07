package org.genegartion.blogPessoal.seguranca;

import java.util.Optional;

import org.genegartion.blogPessoal.model.Usuario;
import org.genegartion.blogPessoal.repository.UsuarioREpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
@Autowired
private UsuarioREpository userRepository;
@Override
public UserDetails loadUserByUsername (String userName) throws UsernameNotFoundException {
	Optional<Usuario> user = userRepository.findByUsuario(userName);
	user.orElseThrow(() -> new UsernameNotFoundException( userName + " not found"));
	return user.map(UserDetailsImpl:: new).get ();
}
}
