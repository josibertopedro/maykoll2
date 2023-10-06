package com.teste.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entidades.Admin;


@Repository
public interface RepositorioAdmin extends CrudRepository<Admin, Integer>{

}
