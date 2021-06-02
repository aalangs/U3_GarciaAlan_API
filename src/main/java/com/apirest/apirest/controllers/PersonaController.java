package com.apirest.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apirest.entity.Persona;
import com.apirest.apirest.services.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController{
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/findAll")
	public List<Persona> findAll(){
		return personaService.getPersonas();
	}
	
	@GetMapping("/findOne/{id}")
	public Persona findById(@PathVariable("id") int id) {
		return personaService.getPersona(id);
	}
	
	@PostMapping("/save")
	public boolean save(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@PutMapping("/update")
	public boolean update(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return personaService.delete(id);
	}
	
}
