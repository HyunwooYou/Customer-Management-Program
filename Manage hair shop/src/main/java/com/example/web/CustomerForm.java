package com.example.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CustomerForm {

	@NotNull
	@Size(min = 1, max = 30)
	private String name;
	
	@NotNull
	@Size(min = 1, max = 30)
	private String phone_number;
	
	@NotNull
	@Size(min = 1, max = 30)
	private String hair_type; 
}
