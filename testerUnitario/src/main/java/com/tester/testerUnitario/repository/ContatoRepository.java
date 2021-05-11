package com.tester.testerUnitario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tester.testerUnitario.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}