package org.genegartion.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.genegartion.blogPessoal.model.UserLogin;
import org.genegartion.blogPessoal.model.Usuario;
import org.genegartion.blogPessoal.repository.UsuarioREpository;
import org.genegartion.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private UsuarioREpository repositoryU;

	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user) {
		return usuarioService.logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Optional<Usuario>> Post(@RequestBody Usuario usuarioNovo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.cadastrarUsuario(usuarioNovo));
	}

	@GetMapping
	ResponseEntity<List<Usuario>> getAllUsuario() {
		List<Usuario> listaDeUsuarios = repositoryU.findAll();

		if (!listaDeUsuarios.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(listaDeUsuarios);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@GetMapping("id/{id}")
	ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
		return repositoryU.findById(id).map(resp -> ResponseEntity.ok().body(resp))
				.orElse(ResponseEntity.notFound().build());
	}
}
