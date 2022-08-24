package com.sms.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sms.model.TAreasClinicas;

@Transactional
public interface TAreasClinicasRepository extends JpaRepository<TAreasClinicas, Long> {
	
	/*@Query(value = "SELECT DISTINCT tac.descareaclinica, th.inicialeshospital "
			+ "FROM THospitales th, TAreasClinicas tac "
			+ "WHERE th.t_areas_clinicas_id = tac.id "
			+ "ORDER BY descareaclinica ASC")
	
	List<TAreasClinicas>findByDescripcionAreaClinica(@Param("descareaclinica") String descripcionAreaClinica, @Param("inicialeshospital") String inicialesHospital);
	*/
}
