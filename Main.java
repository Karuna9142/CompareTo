package com.comparetoex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

  

public class Main {

	public static void main(String[] args) {

		ArrayList<Employe> s1 = new ArrayList<Employe>();

		//add
		s1.add(new Employe(23,"Karuna"));
		s1.add(new Employe(12,"Smriti"));
		s1.add(new Employe(5,"Harshit"));
		
		//sorting as per age
		Collections.sort(s1,new Id());
		System.out.println("Sorting data by age:- ");
		
		for(Employe obj:s1)
		{
			System.out.println(obj.id+ " "+obj.name);
		}
		
		//multiple
		Collections.sort(s1,new Name());
		System.out.println("Sorting data by name:- ");
		
		for(Employe obj1:s1)
		{
			System.out.println(obj1.id+ " "+obj1.name);
		}
	}

}
