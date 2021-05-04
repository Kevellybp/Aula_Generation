package com.MinhaLojaDeGames.Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MinhaLojaDeGames.Games.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
