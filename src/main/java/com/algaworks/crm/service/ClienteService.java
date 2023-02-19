package com.algaworks.crm.service;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.crm.model.Cliente;


public interface ClienteService {
	
	public List<Cliente> listarTodos();

}
