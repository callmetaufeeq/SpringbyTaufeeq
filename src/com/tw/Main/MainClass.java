package com.tw.Main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tw.Tech.Mobile;
import com.tw.services.Insure;

public class MainClass {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext f = new FileSystemXmlApplicationContext("spring.xml");
		Insure i = f.getBean("mobile",Mobile.class);
		i.getEMI();
		f.close();
	}
}
