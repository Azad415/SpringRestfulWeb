package com.examples.first;

import java.util.Date;

public class PrintClass {
	public void printGreeting(){
		int  time = new Date(System.currentTimeMillis()).getHours();
		if (time<12){
			System.out.println("Hi! Good Morning!");
		}else if (time>=12 && time<17 ){
			System.out.println("Hi! Good Afternoon!");
		}else if (time >= 17 && time<21){
			System.out.println("Hi! Good Evening! ");
		}else {
			System.out.println("Hi! Good Night!");
		}
	}
}
