package com.sms.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "THOSPITALES")
public class THospitales implements Serializable {
	
	@Id
	private Long id;
	
	@Column( name = "CEGA")
	private String cega;
	
	@Column( name = "MOTIVO_FD")
	private int motivoFd;
	
	@Column( name = " CODPROVINCIA")
	private String codigoProvincia;
	
	@Column( name = "LOCALIDAD")
	private String localidad;
	
	@Column( name = "CODPOSTAL")
	private String codigoPostal;
	
	@Column( name = "TELEFONO")
	private String telefono;
	
	@Column( name = "IDUSUMOD")
	private String usuarioModificaRegistro;
	
	@Column( name = "FECMOD")
	private Date fechaModificacion;
	
	@Column( name = "IDUSUCRE")
	private String usuarioInsertaRegistro;
	
	@Column( name = "FECRE")
	private Date fechaCreacionRegistro;
	
	@Column( name = "INICIALESHOSPITAL")
	private String inicialesHospital;
	
	@Column( name = "DESCHOSPITAL")
	private String descripcionHospital;

}
