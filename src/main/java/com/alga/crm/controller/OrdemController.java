package com.alga.crm.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alga.crm.model.Ordem;
import com.alga.crm.repository.OrdemRepository;

@RestController
@RequestMapping("/ordem")
public class OrdemController {

	@Autowired
	private OrdemRepository repository;
	
	@GetMapping
	public List<Ordem> ListarTodos(){
		return repository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Ordem Criar(@RequestBody Ordem ordem) {		
	    LocalDate localDate = LocalDate.now();
	    ordem.ordemData = localDate;
		return repository.save(ordem);
	}
}
