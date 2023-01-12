package com.object.methods;

public class ShallowCloning implements Cloneable {
	
	int roll;
	Student s;
	
	ShallowCloning(int roll,Student s){
		this.roll=roll;
		this.s=s;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s= new Student("Komal");
		ShallowCloning sc = new ShallowCloning(10,s);
		System.out.println(sc.roll+" "+sc.s.name);
		ShallowCloning sc1 = (ShallowCloning)sc.clone();
		sc.roll=20;
		sc.s.name="Shree";
		System.out.println(sc1.roll+" "+sc1.s.name);
		
	}
}
class Student
{
	String name;	  
	
	Student(String name){
		this.name=name;
	}
	
	
}