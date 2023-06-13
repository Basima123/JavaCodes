package com.saya.interfacedemo;

public class Lion implements Animal2{

	@Override
	public void eating() {
		System.out.println("Lion eats");
		
	}

	@Override
	public void sleeping() {
		System.out.println("Lion sleep");
		
	}

	@Override
	public void walking() {
		System.out.println("Lion walk");
		
	}

	@Override
	public void name() {
		System.out.println("King of Forest");
		
	}

}
