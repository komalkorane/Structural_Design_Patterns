package com.object.methods;

public class DeepCloning2 implements Cloneable {

	String name;
	int roll;
	Address add;
	public DeepCloning2() {
		super();
	}
	public DeepCloning2(String name, int roll, Address add) {
		super();
		this.name = name;
		this.roll = roll;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "DeepCloning2 [name=" + name + ", roll=" + roll + ", add=" + add + "]";
	}
	public Object clone() {
		Address ad = new Address(add.city,add.pin);
		DeepCloning2 dc = new DeepCloning2(name,roll,ad);
		return dc;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address("Gargoti",416209);
		DeepCloning2 d = new DeepCloning2("Komal",10,a);
		DeepCloning2 dd = (DeepCloning2)d.clone();
		System.out.println("Before "+d);
		System.out.println("Before "+dd);
        d.add.setCity("Kolhapur");
		System.out.println("After "+d);
		System.out.println("After "+dd);
	}
	
}

class Address{
	String city;
	int pin;
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	public Address() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}