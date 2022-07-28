package com.sms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TAREASCLINICAS")
public class TAreasClinicas implements Serializable {

	@Id
	private Long id;
	
	
	
}
