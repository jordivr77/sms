package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
