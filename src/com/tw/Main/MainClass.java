package com.tw.Main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tw.Autowire.Servants;
import com.tw.Tech.Mobile;
import com.tw.services.Insure;

public class MainClass {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext f = new FileSystemXmlApplicationContext("spring.xml");
		Insure i = f.getBean("mobile", Insure.class);

		Insure n = f.getBean("single", Insure.class);
		Insure r = f.getBean("hotel", Insure.class);
		Insure u = f.getBean("servants", Servants.class);

		i.getEMI();
		n.getData();
		r.show();
		u.show();
		f.close();
	}
}
