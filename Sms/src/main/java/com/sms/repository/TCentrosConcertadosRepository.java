package com.sms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.TCentrosConcertados;

@Transactional
public interface TCentrosConcertadosRepository extends JpaRepository<TCentrosConcertados, Long> {
	
	

}
