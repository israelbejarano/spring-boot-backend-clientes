package com.ideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ideas.springboot.backend.apirest.models.entity.Cliente;

/**
 * The Interface IClienteDao.
 * @author Israel Bejarano
 */
public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
}