package com.kd.classNoMain;

import java.util.ArrayList;

public class AdminPeople {
	private ArrayList<Person> person;
	
	public AdminPeople() {
		person=new ArrayList<Person>();
	}
	
	public void add(Person people) {
		person.add(people);
	}
	
	public void print() {
		Person pe;
		for(int p=0;p<person.size();p++) {
			pe=person.get(p);
			System.out.println(pe.getName()+" "+pe.getLastname());
		}
	}
	
	public Person searchPerson(String name) {
		
		Person pr = null;
		Person pe;
		for(int p=0;p<person.size();p++) {
			pe=person.get(p);
			
			if(name.equals(pe.getName())) {
				pr=pe;
			}
		}
	
		return pr;
	} 
	
	public ArrayList<Person> searchOlders(int edad){
		ArrayList<Person> lr = new ArrayList<Person>();
		Person pe;
		for(int p=0;p<person.size();p++) {
			pe=person.get(p);
			
			if(pe.getAge()>edad) {
				lr.add(pe);
			}
		}
		return lr;
	}
	
}
