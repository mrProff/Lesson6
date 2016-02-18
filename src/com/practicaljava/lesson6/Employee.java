package com.practicaljava.lesson6;

public class Employee extends Person implements Payable {
	public Employee(String name) {
		super(name);
	}

	@Override
	public boolean increasePay(int percent) {
		System.out.println("Increasing salary by " + percent + 
				           "%. " + getName());
		return true;
	}

	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
