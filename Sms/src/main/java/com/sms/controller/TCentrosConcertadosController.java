package com.sms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sms.service.TCentrosConcertadosService;
import com.sms.service.DTO.SelectedItemDTO;

@RestController

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})

@RequestMapping("/api")
public class TCentrosConcertadosController {
	
	@Autowired
	private TCentrosConcertadosService tCentrosConcertadosService;
	
	@GetMapping("/getcentrosconcertados")
	public ResponseEntity<List<SelectedItemDTO>> getTCentrosConcertados() {
		
		List<SelectedItemDTO> centrosConcertados = new ArrayList<>();
		
		tCentrosConcertadosService.obtenerCentrosConcertados().forEach(centrConcertados -> {
			
			SelectedItemDTO centrosConcer = new SelectedItemDTO();
			centrosConcer.setValue(centrConcertados.getInicialesCentroConcertado());
			centrosConcer.setLabel(centrConcertados.getDescripcionCentro());
			
			centrosConcertados.add(centrosConcer);
			
		});
		
		return new ResponseEntity<>(centrosConcertados, centrosConcertados.isEmpty() ? HttpStatus.EXPECTATION_FAILED : HttpStatus.OK);
		
	}

}
