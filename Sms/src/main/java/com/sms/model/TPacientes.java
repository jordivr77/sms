package com.sms.model;

import java.io.Serializable;
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
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TPACIENTES")
public class TPacientes implements Serializable {

	@Id
	@Column
	private Long id;
	
	@Column( name = "NOMBRE")
	private String nombre;
	
	@Column( name = "APELLIDO1")
	private String apellido1;
	
	@Column( name = "APELLIDO2")
	private String apellido2;
	
	@Column( name = "EMAIL")
	private String email;
	
	@Column( name = "PDFDIAGNOSTICO")
	private String pdfDiagnostico;
	
	/*@ManyToOne
	@JoinColumn(name = "idHospitales")
	private TPacientes tPacientes;*/
	
	@ManyToOne
	private THospitales tHospitales;
	
	/*@OneToMany(mappedBy = "tPacientes", cascade = CascadeType.ALL)
	private List<TPacientes> lTPacientes = new ArrayList<>();*/
}
