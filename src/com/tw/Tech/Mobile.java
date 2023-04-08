package com.tw.Tech;

import com.tw.services.Insure;

public class Mobile implements Insure {
	private String brandName;
	private int price;

	public Mobile(String brandName, int price) {
		//super();
		this.brandName = brandName;
		this.price = price;
	}

	@Override
	public void getEMI() {
		System.out.println("Hi "+this.brandName+" "+this.price);
	}

}
