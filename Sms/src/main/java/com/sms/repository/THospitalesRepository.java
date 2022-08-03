package com.sms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.THospitales;

@Transactional
public interface THospitalesRepository extends JpaRepository<THospitales, Long> {

}
