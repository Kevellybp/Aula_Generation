package com.MinhaLojaDeGames.Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MinhaLojaDeGames.Games.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
public List<Produto> findAllByDescricaoAndTituloContainingIgnoreCase(String descricao, String titulo);
}
