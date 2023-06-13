package com.simple.javaProgram;

public class LoopingProgram {
	int no;
	int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=5;

		LoopingProgram lp = new LoopingProgram();
		lp.onePattern(j);
		lp.sequenceNum(j);
		lp.oddNum(j);
		lp.threeTimesTable(j);

	}

	private void threeTimesTable(int j) {
		// TODO Auto-generated method stub
		i=1;
		System.out.println();
		System.out.println("Three Times Table");
		while(i<=j)
		{
			no =i*3;
			
			System.out.print(no + " ");
			i++;
			
		}
		
	}

	private void oddNum(int j) {
		// TODO Auto-generated method stub
		i=1;
		no=1;
		System.out.println();
		System.out.println("Odd Number");
		while(i<=j)
		{
			
			System.out.print(no + " ");
			no=no+2;
			i++;
		}
		
	}

	private void sequenceNum(int j) {
		// TODO Auto-generated method stub
		i=0;
		System.out.println();
		System.out.println("Sequence no");
		while(i<=j)
		{
			no=no+1;
			System.out.print(no + " ");
			i++;
		}
		
	}

	private void onePattern(int j) {
		// TODO Auto-generated method stub
		int i=1;
		
		System.out.println("Pattern one :");
		while(i<=j)
		{
			no=1;
			System.out.print(no +" ");
			i++;
		}
		
		
	}

}
