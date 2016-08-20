package br.com.fabricadeprogramador.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data  
public class Pessoa {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	private String email;
	
	private String telefone;
	
	private Date dataCadastro= new Date();
	
	
}
