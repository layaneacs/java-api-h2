package com.alga.crm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alga.crm.model.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String>{
	
}