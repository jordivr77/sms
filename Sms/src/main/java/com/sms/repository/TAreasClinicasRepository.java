package com.sms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.TAreasClinicas;

@Transactional
public interface TAreasClinicasRepository extends JpaRepository<TAreasClinicas, Long> {

}
