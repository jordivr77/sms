package com.sms.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "THOSPITALES")
public class THospitales implements Serializable {
	
	@Id
	@GeneratedValue
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
	
	
	@ManyToOne
	@JoinColumn(name = "TAREASCLINICAS_ID")
	private THospitales tHospitales;
	
	@ManyToOne
	@JoinColumn(name = "TPACIENTES_ID")
	private TPacientes tPacientes;
	
	
	
	
	
}
