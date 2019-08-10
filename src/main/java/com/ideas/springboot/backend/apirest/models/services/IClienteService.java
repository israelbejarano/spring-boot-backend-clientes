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
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the cliente
	 */
	public Cliente findById(Long id);
	
	/**
	 * Save.
	 *
	 * @param cliente the cliente
	 * @return the cliente
	 */
	public Cliente save(Cliente cliente);
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(Long id);
}