package com.saya.interfacedemo;

public class Cat implements Animal2{

	@Override
	public void eating() {
		System.out.println("Cat eats");
	}

	@Override
	public void sleeping() {
		System.out.println("cat sleep");
		
	}

	@Override
	public void walking() {
		System.out.println("Cat walk");
		
	}

	@Override
	public void name() {
		System.out.println("Cute Cat");	
	}

}
