package com.ideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.ideas.springboot.backend.apirest.models.entity.Cliente;

/**
 * The Class ClienteServiceImpl.
 * @author Israel Bejarano
 */
@Service
public class ClienteServiceImpl implements IClienteService {
	
	/** The cliente dao. */
	@Autowired
	private IClienteDao clienteDao;

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the cliente
	 */
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	/**
	 * Save.
	 *
	 * @param cliente the cliente
	 * @return the cliente
	 */
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}
}