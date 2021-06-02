package com.apirest.apirest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.apirest.entity.Persona;
import com.apirest.apirest.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	public List<Persona> getPersonas() {
		return personaRepository.findAll();
	}
	
	public boolean save(Persona persona) {
		return personaRepository.existsById((int) personaRepository.save(persona).getId());
	}
	
	public boolean delete(int id) {
		personaRepository.deleteById(id);
		return !personaRepository.existsById(id);
	}

	public Persona getPersona(int id) {
		return personaRepository.findById(id);
	}
}
