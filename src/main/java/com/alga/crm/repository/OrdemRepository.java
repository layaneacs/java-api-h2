package com.alga.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alga.crm.model.Ordem;

@Repository
public interface OrdemRepository extends JpaRepository<Ordem, Long> {

}
