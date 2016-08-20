package br.com.fabricadeprogramador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabricadeprogramador.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}