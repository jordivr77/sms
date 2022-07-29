package com.sms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TPACIENTES")
public class Paciente implements Serializable{

	@Id
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
	
	@ManyToOne
	private Paciente paciente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPdfDiagnostico() {
		return pdfDiagnostico;
	}
	public void setPdfDiagnostico(String pdfDiagnostico) {
		this.pdfDiagnostico = pdfDiagnostico;
	}
	
	
}
