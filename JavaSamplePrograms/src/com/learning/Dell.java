package com.learning;

public class Dell extends Laptop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dell dell= new Dell();
		dell.browse();
		dell.doProgram();
		dell.touch_screen();
		System.out.println(dell.harddisk);	
		}
void touch_screen()
{
System.out.println("Touch Screen");
}
}
