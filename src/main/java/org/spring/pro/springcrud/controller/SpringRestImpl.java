package org.spring.pro.springcrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.spring.pro.springcrud.model.JSONmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestImpl implements SpringRest{
	
	@Autowired
	JSONmodel set;
	
	
	@RequestMapping(value = "/addDetails",method = RequestMethod.POST)
	public List<String> addDetails(@RequestBody String detail) {
		
		List addString = new ArrayList();
		addString.add(detail);
		set.setDetails(addString);
		return addString;
	}

	@RequestMapping(value = "/getDetails",method = RequestMethod.GET)
	public List<String> getDetails() {
		List returnString = set.getDetails();
		return returnString;
	}

	@RequestMapping(value = "/getDetail/{value}",method = RequestMethod.GET)
	public String isDetails(@PathVariable String value) {
		List returnString = set.getDetails();
		if(returnString.contains(value)){
			return "Value Exists";
		}else{
			return "No";
		}
	}

	@RequestMapping(value = "/updateDetails",method = RequestMethod.PUT)
	public List<String> returnDetails(@RequestBody String detail) {
		List addString = set.getDetails();
		addString.add(detail);
		set.setDetails(addString);
		return addString;
	}
	
	@RequestMapping(value = "/deleteDetails",method = RequestMethod.DELETE)
	public List<String> deleteDetails(@RequestBody String detail) {
		List addString = set.getDetails();
		addString.remove(detail);
		set.setDetails(addString);
		return addString;
	}
	
	
	
	
	
	

}
