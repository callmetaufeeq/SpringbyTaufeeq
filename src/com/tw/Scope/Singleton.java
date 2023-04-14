package com.tw.Scope;

import com.tw.services.Insure;

public class Singleton implements Insure {
	public String a;
	public String b;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}


	@Override
	public void getData() {
		System.out.println(this.a +" "+this.b);		
	}

	@Override
	public void getEMI() {
		System.out.println("bye");
	}
}
