package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sms.model.TCentrosConcertados;
import com.sms.repository.TCentrosConcertadosRepository;

@Service
public class TCentrosConcertadosService {
	
	@Autowired
	TCentrosConcertadosRepository tCentrosConcertadosRepository;
	
	@Cacheable(value = "centrosconcertados", key= "#id")
	public List<TCentrosConcertados> obtenerCentrosConcertados() {
		return tCentrosConcertadosRepository.findAll();
	}

}
