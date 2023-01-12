package com.object.methods;

public class EqualsMethod {
	
	String a;
	
	EqualsMethod(String a){
		this.a=a;
	}

	public boolean equals(Object o) {
		if( this instanceof EqualsMethod)
			return true;
		if(o == this) {
			EqualsMethod e2 = (EqualsMethod)o;
			return a.equals(e2.a);
		}else
			return false;
		
	}	
	
	public static void main(String[] args) {

		EqualsMethod e = new EqualsMethod("Komal");
		EqualsMethod e1 = new EqualsMethod("Komal");
		System.out.println(e.equals(e1));
		
	}

}
