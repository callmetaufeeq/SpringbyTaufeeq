package com.tw.Tech;

import com.tw.services.Insure;

public class Mobile implements Insure {
	private String brandName;
	private int price;

	public Mobile(String brandName, int price) {
		// super();
		this.brandName = brandName;
		this.price = price;
	}

	@Override
	public void getEMI() {
		System.out.println(" New " + this.brandName + " => " + this.price);
	}

	public void start() {
		System.out.println("Switch on");

	}

	public void end() {
		System.out.println("Switch off");
	}

	@Override
	public void getData() {
		System.out.println("hi");
		
	}
}
