package org.spring.pro.springcrud.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JSONmodel {
	
	
	private String name ="springcrud";
	
	
	private List details;


	public List getDetails() {
		return details;
	}


	public void setDetails(List details) {
		this.details = details;
	}
	
	

}
