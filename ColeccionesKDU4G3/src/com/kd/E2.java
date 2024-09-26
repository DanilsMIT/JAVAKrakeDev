package com.kd;

import java.util.ArrayList;

import com.kd.classNoMain.Person;

public class E2 {

	public static void main(String[] args) {
		ArrayList<Person> persona=new ArrayList<Person>();
		persona.add(new Person("Pepe","Taxio"));
		persona.add(new Person("Ete","Sech"));
		persona.add(new Person("Po","Taxio"));
		
		Person elementperson;
		for(int p=0;p<persona.size();p++) {
			elementperson=persona.get(p);
			System.out.println(elementperson.getLastname());
		}
		
	}

}
