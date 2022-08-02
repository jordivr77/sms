package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.TPacientes;

public interface PacienteRepository extends JpaRepository<TPacientes, Long>{

}
