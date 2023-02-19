package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.service.ClienteService;



@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	
	
	 @GetMapping(value = "ola")
	 public String hello() { return "Olá, mundo"; }
	 
	 @GetMapping(value = "todos")
	 public List<Cliente> todos(){
		 
		 
		 return this.clienteService.listarTodos();
	 }
	 


}
