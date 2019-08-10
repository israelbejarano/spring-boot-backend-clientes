package com.ideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.ideas.springboot.backend.apirest.models.entity.Cliente;

/**
 * The Interface IClienteService.
 * @author Israel Bejarano
 */
public interface IClienteService {
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<Cliente> findAll();
}