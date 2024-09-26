package com.kd;

import java.util.ArrayList;

import com.kd.classNoMain.AdminPeople;
import com.kd.classNoMain.Person;

public class TestAdminPeople {

	public static void main(String[] args) {
		AdminPeople adminP=new AdminPeople();
		adminP.add(new Person("Pepe","Taxio",25));
		adminP.add(new Person("Ete","Sech",20));
		adminP.add(new Person("Po","Taxio",30));
		
		adminP.print();
		Person p =adminP.searchPerson("Pepe");
		System.out.println("la edad de "+p.getLastname()+" "+p.getName()+" es: "+p.getAge());
		
		ArrayList<Person> PL=adminP.searchOlders(20);
		System.out.println("Los mayores a 20 son: "+PL.size());
	}

}
