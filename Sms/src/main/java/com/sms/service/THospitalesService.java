package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sms.model.THospitales;
import com.sms.repository.THospitalesRepository;

@Service
public class THospitalesService {
	
	@Autowired
	THospitalesRepository tHospitalesRepository;
	
	@Cacheable(value = "hospitales", key = "#id")
	public List<THospitales> obtenerHospitales() {
		return tHospitalesRepository.findAll();
	}

}
