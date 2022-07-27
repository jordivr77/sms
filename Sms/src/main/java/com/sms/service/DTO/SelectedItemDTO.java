package com.sms.service.DTO;

import lombok.Data;

@Data
public class SelectedItemDTO implements Comparable<SelectedItemDTO> {
	
	private String label;
	private String value;
	

	@Override
	public int compareTo(SelectedItemDTO o) {
		return this.getLabel().compareTo(o.getLabel());
	}

}
