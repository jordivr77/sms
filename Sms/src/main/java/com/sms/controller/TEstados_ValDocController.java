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

import com.sms.service.TEstados_ValDocService;
import com.sms.service.DTO.SelectedItemDTO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})

@RequestMapping("/api")
public class TEstados_ValDocController {
	
	@Autowired
	private TEstados_ValDocService tEstados_ValDocService;
	
	@GetMapping("/getestadosvaldoc")
	public ResponseEntity<List<SelectedItemDTO>> getTEstados_ValDoc() {
		
		List<SelectedItemDTO> estados_ValDocDtos = new ArrayList<>();
		
		tEstados_ValDocService.obtenerEstados_ValDocs().forEach(estados -> {
			SelectedItemDTO estadosVal = new SelectedItemDTO();
			estadosVal.setValue(estados.getId().toString());
			estadosVal.setLabel(estados.getDescripcion());
			
			estados_ValDocDtos.add(estadosVal);
			
		
		});
		
		return new ResponseEntity<>(estados_ValDocDtos, estados_ValDocDtos.isEmpty() ? HttpStatus.EXPECTATION_FAILED : HttpStatus.OK);
	}

}
