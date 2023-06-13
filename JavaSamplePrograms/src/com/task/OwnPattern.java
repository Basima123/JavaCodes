package com.task;

public class OwnPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OwnPattern op=new OwnPattern();
		op.pattern1();

	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;i--)
			{
				System.out.print(i +" \t");
			}
			System.out.println();
		}
		
	}

}
