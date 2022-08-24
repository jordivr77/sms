package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sms.model.TAreasClinicas;
import com.sms.repository.TAreasClinicasRepository;

@Service
public class TAreasClinicasService {
	
	@Autowired
	TAreasClinicasRepository tAreasClinicasRepository;
	
	
	@Cacheable(value = "areas", key = "#id")
	public List<TAreasClinicas> obtenerAreasClinicas() {
		return tAreasClinicasRepository.findAll();
	}
	
	
	
	
	/*SessionFactory sessionFactory;

    @Autowired
    private Environment environment;
    @Autowired
    private DataSource dataSource;
    
	@SuppressWarnings("unchecked")
	public THospitalAreaClinica getAreaClinica(String descareaclinica, String inicialeshospital) {
		@SuppressWarnings({ "unused", "rawtypes" })
		org.hibernate.query.Query query = null;
		List<THospitalAreaClinica> listaArea = new ArrayList<>();
		THospitalAreaClinica resultadoAreaClinica = null;
		String hqlString = "SELECT DISTINCT descareaclinica, inicialeshospital \r\n"
				+ "FROM THospitales.th, TAreasClinicas.tac\r\n"
				+ "WHERE th.t_areas_clinicas_id = tac.id\r\n"
				+ "ORDER BY descareaclinica ASC";
		
		
		try {
			
			Object session;
			query = session.createQuery(hqlString);
			query.setParameter("descareaclinica", Long.parseLong(descareaclinica));
			query.setParameter("inicialeshospital", Long.parseLong(inicialeshospital));
			listaArea = query.list();
			if(!listaArea.isEmpty()) {
				resultadoAreaClinica = listaArea.get(0);
			}
				
		} catch (Exception ex) {	
			ex.printStackTrace();
		}
		return resultadoAreaClinica;
	}*/
	
}
