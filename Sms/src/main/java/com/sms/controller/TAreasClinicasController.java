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

import com.sms.service.TAreasClinicasService;
import com.sms.service.DTO.SelectedItemDTO;

@RestController

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})

@RequestMapping("/api")
public class TAreasClinicasController {
	
	@Autowired
	TAreasClinicasService tAreasClinicasService;
	
	@GetMapping("/getareashospitales")
	public ResponseEntity<List<SelectedItemDTO>> getAreas() {
		
		List<SelectedItemDTO> areas = new ArrayList<>();
		
		tAreasClinicasService.obtenerAreasClinicas().forEach(area -> {
			SelectedItemDTO areasHospitales = new SelectedItemDTO();
			areasHospitales.setValue(area.getCodigoAreaClinica());
			areasHospitales.setLabel(area.getDescripcionAreaClinica());
			
			areas.add(areasHospitales);
		});
		
		return new ResponseEntity<>(areas, areas.isEmpty() ? HttpStatus.EXPECTATION_FAILED : HttpStatus.OK); 
	}
	
	/*@GetMapping("/getareasclinicas")
	public ResponseEntity<List<SelectedItemDTO>> getAreaClinica() {
		List<SelectedItemDTO> listaAreaSelectedItemDTOs = new ArrayList<>();
		obtenerAreas().forEach(areas -> {
			SelectedItemDTO areasDTO = new SelectedItemDTO();
			areasDTO.setValue(areas.get)
		})
	}

	public Map<String, String> obtenerAreas() {
		LinkedHashMap<String, String> resultadoHashMap = new LinkedHashMap<String, String>();
		try {
			SessionFactory sessionFactory;
			org.hibernate.Session session = sessionFactory.getCurrentSession(); 
			
			@SuppressWarnings("rawtypes")
			org.hibernate.query.Query query = session.createQuery("SELECT DISTINCT  descareaclinica,inicialeshospital FROM thospitales th , tareasclinicas tac \r\n"
					+ "WHERE th.t_areas_clinicas_id = tac.id ORDER BY descareaclinica ASC");
			
			@SuppressWarnings("unchecked")
			List<Object[]> lista = query.list();
			for(Object[] item : lista) {
				resultadoHashMap.put(item[1].toString(), item[0].toString());
			}
		} catch (Exception ex) {
			throw ex;
		}
		
		return resultadoHashMap;
		
	}*/

}
