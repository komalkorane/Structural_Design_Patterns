package com.object.methods;

import java.util.Objects;

public class HashCodeMethod {

	int roll;
	String name;
	
	HashCodeMethod(int roll, String name){
		this.roll=roll;
		this.name=name;
	}
	
	public int hashCode() {
		return Objects.hash(roll,name);
	}
	public boolean equals(Object o) {
		if(this == null) 
			return true;
		if(this == o) 
		    return true;
		if(this instanceof HashCodeMethod) {
			HashCodeMethod hc =(HashCodeMethod)o;
			return roll==hc.roll && name.equals(hc.name);
		}
		return false;
	}
	
	public static void main(String[] args) {
       
		HashCodeMethod hc = new HashCodeMethod(10,"Komal");
		HashCodeMethod hc1 = new HashCodeMethod(20,"Shree");
		HashCodeMethod hc2 = new HashCodeMethod(20,"Shree");
		System.out.println(hc.hashCode());
		System.out.println(hc1.hashCode());
		System.out.println(hc2.hashCode());
		
	}

}
