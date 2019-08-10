package com.ideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas.springboot.backend.apirest.models.entity.Cliente;
import com.ideas.springboot.backend.apirest.models.services.IClienteService;

/**
 * The Class ClienteRestController.
 * @author Israel Bejarano
 */
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	/** The cliente service. */
	@Autowired
	private IClienteService clienteService;
	
	/**
	 * Index.
	 *
	 * @return the list
	 */
	@GetMapping("/clientes")
	public List<Cliente> index() {
		return clienteService.findAll();
	}
}