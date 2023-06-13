package com.saya.interfacedemo;

import java.sql.Connection;

import org.apache.tomcat.jni.Address;



public class TestClass  {

	public static void main(String[] args) {
		Animal2 ob=new Cat();
		ob.eating();
		Address add=new Address();
		System.out.println(add.hashCode());
		Animal2 ob3=new Animal2() {
		public	void name() {
				System.out.println("=======================");
			}

		@Override
		public void eating() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sleeping() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void walking() {
			// TODO Auto-generated method stub
			
		}
		};
ob3.name();
	}

}
