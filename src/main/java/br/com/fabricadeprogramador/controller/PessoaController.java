package br.com.fabricadeprogramador.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fabricadeprogramador.entity.Pessoa;
import br.com.fabricadeprogramador.repository.PessoaRepository;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Getter @Setter
	private Pessoa pessoa;
	
	@PostConstruct
	public void init(){
		pessoa = new Pessoa();
	}
	
	public void salvar(){
		pessoaRepository.save(pessoa);
	}

}