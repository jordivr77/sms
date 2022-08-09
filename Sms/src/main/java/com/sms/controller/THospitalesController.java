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

import com.sms.service.THospitalesService;
import com.sms.service.DTO.SelectedItemDTO;

@RestController

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})

@RequestMapping("/api")
public class THospitalesController {
	
	@Autowired
	private THospitalesService tHospitalesService;
	
	@GetMapping("/gethospitales")
	public ResponseEntity<List<SelectedItemDTO>> getTHospitales() {
		
		List<SelectedItemDTO> hospitales = new ArrayList<>();
		
		tHospitalesService.obtenerHospitales().forEach(hospi -> {
			
			SelectedItemDTO hospitalesMurcia = new SelectedItemDTO();
			hospitalesMurcia.setValue(hospi.getInicialesHospital());
			hospitalesMurcia.setLabel(hospi.getDescripcionHospital());
			
			hospitales.add(hospitalesMurcia);
			
		});
		
		return new ResponseEntity<>(hospitales, hospitales.isEmpty() ? HttpStatus.EXPECTATION_FAILED : HttpStatus.OK);
	}

}
