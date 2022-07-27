package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sms.model.TEstados_ValDoc;
import com.sms.repository.TEstados_ValDocRepository;

@Service
public class TEstados_ValDocService {
	
	@Autowired
	TEstados_ValDocRepository tEstados_ValDocRepository;
	
	@Cacheable(value = "estados_valdoc", key = "#id")
	public List<TEstados_ValDoc> obtenerEstados_ValDocs() {
		return tEstados_ValDocRepository.findAll();
	}

}
