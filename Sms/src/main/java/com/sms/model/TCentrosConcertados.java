package com.sms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TCENTROSCONCERTADOS")
public class TCentrosConcertados implements Serializable {

	@Id
	@Column
	private Long id;
	
	@Column(name = "DESCCENTROCONCERTADO")
	private String descripcionCentro;
	
	@Column(name = "INICIALESCENTROCONCERTADO")
	private String inicialesCentroConcertado;
}
