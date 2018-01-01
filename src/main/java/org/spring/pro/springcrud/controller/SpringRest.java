package org.spring.pro.springcrud.controller;

import java.util.List;

public interface SpringRest {
	
	List<String> addDetails(String detail);
	
	List<String> getDetails();
	
	String isDetails(String detail);
	
	List<String> returnDetails(String detail);
	
	List<String> deleteDetails(String detail);

}
