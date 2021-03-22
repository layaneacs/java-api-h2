package com.alga.crm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alga.crm.model.Produto;
import com.alga.crm.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public List<Produto> ListarTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Optional<Produto> produtoById(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PostMapping
	public Produto Criar(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
}
