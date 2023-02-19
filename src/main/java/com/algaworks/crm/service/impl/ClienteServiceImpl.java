package com.algaworks.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;
import com.algaworks.crm.service.ClienteService;


public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	
	
	public void salvar(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public List<Cliente> listarTodos() {
		return clienteRepository.findAll();
	}
	
}
