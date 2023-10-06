	package com.teste.repositorios;
	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

import entidades.Admin;
import entidades.Aluno;


	@Repository
	public interface RepositorioAluno extends CrudRepository<Aluno, Integer>{

	}



