package com.object.methods;

import java.util.Objects;

public class EqualsDemo {

	String name;
	int id;
	
	public EqualsDemo() {
		super();
	}
	public EqualsDemo(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "EqualsDemo [name=" + name + ", id=" + id + "]";
	}
	public int hashcode() {
		return Objects.hash(name,id);
	}
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(this == o)
			return true;
		if(o instanceof EqualsDemo) {
			EqualsDemo e = (EqualsDemo)o;
			return name.equals(e.name) && id==e.id;
		}else
			return false;
	}
	
	public static void main(String[] args) {
		EqualsDemo e1 = new EqualsDemo("Komal",19);
		EqualsDemo e2 = new EqualsDemo("Shree",19);
		EqualsDemo e3 = new EqualsDemo("Komal",11);
		EqualsDemo e4 = new EqualsDemo("Komal",19);
		
		System.out.println(e1==e4);
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}
	
}
