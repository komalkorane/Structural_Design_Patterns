package com.object.methods;

import java.util.Objects;

public class Equals {
	String name;
	int roll;
	
	Equals(String name, int roll){
		this.name=name;
		this.roll=roll;
	}
	public String toString() {
		return name+" "+roll;
	}
	
	public int hashcode() {
	return Objects.hash(name,roll);
}
	
		public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(this == null)
			return true;
		if( this instanceof Equals) {
			Equals e5 = (Equals)o;
			return Objects.equals(name,e5.name) && roll == e5.roll;
		}
		else
			return false;
		
	}
	public static void main(String[] args) {

		Equals e = new Equals("komal", 10);
		Equals e1 = new Equals("sayli", 10);
		Equals e2 = new Equals("komal", 100);
		Equals e3 = new Equals("komal", 10);
		
		System.out.println(e.equals(e1));
		System.out.println(e.equals(e2));
		System.out.println(e.equals(e3));
		
	}

}
