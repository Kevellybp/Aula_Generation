package org.genegartion.blogPessoal.repository;

import java.util.Optional;

import org.genegartion.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioREpository extends JpaRepository<Usuario, Long>{
public Optional<Usuario> findByUsuario (String usuario);

}
