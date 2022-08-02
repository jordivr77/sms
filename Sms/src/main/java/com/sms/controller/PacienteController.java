package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.TPacientes;
import com.sms.service.PacienteService;

@RestController
@RequestMapping("/api")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	// GET --> Obtener un recurso de una lista
	@GetMapping("/pacientes")
	public List<TPacientes> obtener() {
		return pacienteService.obtenerTodos();
	}

}
