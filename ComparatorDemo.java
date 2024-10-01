package com.comparetoex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
int rollNo;
String name;
int age;

//parametrized constructor
Student(int rollNo,String name,int age)
{
  this.rollNo=rollNo;
  this.name=name;
  this.age=age;
}
  public int getRollNo() {
  return rollNo;
}
  public String getName() {
  return name;
}
public int getAge()
{
return age;
}
}
class AgeComapartor implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age==o2.age)
		return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return-1;
	}
	
}
class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(new Student(01, "pihu",21));
		s1.add(new Student(02, "Meenu",25));
		s1.add(new Student(01, "Shalu",24));
		
		System.out.println("sorting by name:- ");
		Collections.sort(s1,new NameComparator());
		
		for(Student s2:s1)
		{
			System.out.println(s2.getRollNo()+ " "+s2.getName()+ " "+s2.getAge());
		}

		//Sorting by age
		System.out.println("Sorting by age:-");
		Collections.sort(s1, new AgeComapartor());
		for(Student s2:s1)
		{
			System.out.println(s2.getRollNo()+ " "+s2.getName()+ " "+s2.getAge());
		}
		
	}

}
