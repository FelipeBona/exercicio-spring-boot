package com.algaworks.cm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.cm.model.Cliente;

@Repository //define um repositório bean (essa não é bem do Spring Data, mas é bem associada a ele)
public interface ClienteRepository extends  JpaRepository<Cliente, Long> {

	List<Cliente> findAll();

	


}
