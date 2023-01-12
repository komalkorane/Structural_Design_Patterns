package com.object.methods;

public class DeepCloning implements Cloneable{

	int roll;
	Student1 s;
	
	DeepCloning(int roll, Student1 s){
		this.roll=roll;
		this.s=s;
	}
	public Object clone() {
		Student1 s = new Student1("Komal");
		DeepCloning dc1 = new DeepCloning(10,s);
		return dc1;
	}
	public static void main(String[] args) throws Exception {

		Student1 s1 = new Student1("Komal");
		DeepCloning dc = new DeepCloning(10,s1);
		System.out.println(dc.roll+" "+dc.s.name);
		DeepCloning dc2 = (DeepCloning)dc.clone();
		dc2.s.name="Shree";
		dc2.roll=200;
		System.out.println(dc.roll+" "+dc.s.name);
	}
}
class Student1
{
	String name;
	
	Student1(String name){
		this.name=name;
	}
}