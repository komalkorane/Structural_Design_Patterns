package com.object.methods;

public class ShallowCloning2 implements Cloneable {

	String dept;
	Employee emp;
	public ShallowCloning2() {
		super();
	}
	public ShallowCloning2(String dept, Employee emp) {
		super();
		this.dept = dept;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "ShallowCloning2 [dept=" + dept + ",  emp=" + emp + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e = new Employee( "Komal");
		ShallowCloning2 sc = new ShallowCloning2("developer",e);
		System.out.println(sc);
		ShallowCloning2 sc1 =(ShallowCloning2)sc.clone();		
		System.out.println(sc1);
        e.setName("Shree");
		System.out.println(sc1);
	}
}

class Employee{

	String name;
	public Employee( String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [ name=" + name + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
}