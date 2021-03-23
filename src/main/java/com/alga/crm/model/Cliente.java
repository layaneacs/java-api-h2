package com.alga.crm.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Cliente")
public class Cliente {		
	public String id;
	public String nome;	
}
