package com.learning;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo ed = new ExceptionDemo();
		int no1=10,no2=0;
		
		ed.division(no1,no2);
		ed.addition(no1,no2);
		ed.subtraction(no1,no2);

	}

	private void subtraction(int no1, int no2) {
		// TODO Auto-generated method stub
		System.out.println(no1-no2);
		
	}

	private void addition(int no1, int no2) {
		// TODO Auto-generated method stub
		System.out.println(no1+no2);
		
	}

	private void division(int no1, int no2) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(no1/no2);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("cant divisible by 0");
		}
		
		catch(Exception ae)
		{
			System.out.println("other Exceptions");
		}
	}

	

}
