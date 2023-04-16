package com.tw.Autowire;

import com.tw.services.Insure;

public class Hotel implements Insure {
	public int id;
	public String name;

	public Hotel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public void getEMI() {
		System.out.println("hey");
	}

	@Override
	public void getData() {
		System.out.println("bye");
	}

	@Override
	public void show() {
		System.out.println(this.id + " " + this.name);

	}

}
