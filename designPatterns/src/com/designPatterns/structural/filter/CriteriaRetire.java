package com.designPatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaRetire implements Criteria{

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {

		List<Employee> singlePersons = new ArrayList<>();
	    for (Employee person : persons) {
	      if (person.getRetireStatus().equalsIgnoreCase("YES")) {
	        singlePersons.add(person);
	      }
	    }
	    return singlePersons;
	  }
}
