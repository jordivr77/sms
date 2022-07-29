package com.sms.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TAREASCLINICAS")
public class TAreasClinicas implements Serializable {

	@Id
	private Long id;
	
	@Column( name = "CODAREACLINICA")
	private String codigoAreaClinica;
	
	@Column( name = "DESCAREACLINICA")
	private String descripcionAreaClinica;
	
	@Column( name = "IDUSUMOD")
	private String idUsuarioModificaRegistro;
	
	@Column( name = "FECMOD")
	private Date fechaModificacion;
	
	@Column( name = "IDESUCRE")
	private String idUsuarioCreaRegistro;
	
	@Column( name = "FECRE")
	private Date fechaRegistro;
	
	@OneToMany( mappedBy = "tHospitales")
	private List<THospitales> tHospitales;
	
}
