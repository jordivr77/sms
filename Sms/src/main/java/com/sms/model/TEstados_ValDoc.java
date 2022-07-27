package com.sms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TESTADOS_VALDOC")
public class TEstados_ValDoc implements Serializable {
	
	@Id
	@Column(name = "CODIGO")
	private Long id;
	@Column(name = "DESCRIPCION")
	private String descripcion;
		

}
