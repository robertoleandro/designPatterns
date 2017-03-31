package com.designPatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> femalePersons = new ArrayList<>();
		for(Employee person: persons){
			if(person.getGender().equalsIgnoreCase("FAMELE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
