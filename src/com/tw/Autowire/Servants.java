package com.tw.Autowire;

import com.tw.services.Insure;

public class Servants implements Insure {
	public String name;
	public int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void getEMI() {
		System.out.println("Faizan");

	}

	@Override
	public void getData() {
		System.out.println("Sohel");
	}

	@Override
	public void show() {
		System.out.println("Taufeeq");
	}
}
