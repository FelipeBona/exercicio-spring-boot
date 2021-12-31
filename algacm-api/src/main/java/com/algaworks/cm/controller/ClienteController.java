package com.algaworks.cm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.cm.model.Cliente;
import com.algaworks.cm.repository.ClienteRepository;

@RestController //define uma classe que contém métodos para uma API RESTful.
@RequestMapping("/clientes") //mapeia requisições REST.
public class ClienteController {

	@Autowired //já falada e exemplificada, define pontos de injeção de dependências dentro de uma classe.
	private ClienteRepository clienteRepository;
	
	@GetMapping //  Agora você pode usar @GetMapping no método que manipulará a solicitaçao http clientes
	public List<Cliente> listar () {
    return clienteRepository.findAll();
		
	}
	@PostMapping //anotações para mapear todos os URLs de solicitação HTTP de entrada para os métodos de controlador correspondentes.
	@ResponseStatus(HttpStatus.CREATED) // com essa anotação, podemos especificar o status HTTP desejado da resposta.
	public Cliente adicionar(@RequestBody Cliente cliente) { // mapeia o corpo da solicitação HTTP para um objeto.
		return clienteRepository.save(cliente);
	}
}
