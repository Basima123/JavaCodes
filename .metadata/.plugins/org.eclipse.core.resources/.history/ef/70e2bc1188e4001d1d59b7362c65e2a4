package com.learning;

public class Looping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1124;
		Looping1 ll= new Looping1();
		ll.find_spy_no(num);

	}

	private void find_spy_no(int number) {
		// TODO Auto-generated method stub
		int num=number;
		int add_total=0;
		int mul_total=1;
		int rem;
		while(num>0)
		{
		rem=num%10; //1124%10=4
		add_total=add_total+rem;//0+4
		mul_total=mul_total*rem;//1*4
		num=num/10;//112
		
		}
		
		if(add_total==mul_total)
		{
			System.out.println(number + " is spy number");
		}
		else
			System.out.println(number + " is not spy number");
		}

		
		
	}

