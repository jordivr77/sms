package com.sms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.TEstados_ValDoc;

@Transactional
public interface TEstados_ValDocRepository extends JpaRepository<TEstados_ValDoc, Long> {

}
