package com.apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirest.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
	Persona findById(int id);
}
