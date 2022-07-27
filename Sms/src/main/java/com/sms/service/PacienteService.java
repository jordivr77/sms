package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.Paciente;
import com.sms.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	// Obtenemos todos los pacientes que hay en la BD
	public List<Paciente> obtenerTodos() {
		return pacienteRepository.findAll();
	}
}

