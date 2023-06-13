package com.learning;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ad=new  ArrayDemo();
		//ad.learn_array1();
		// ad.learn_array2();
		//ad.calculate_percentage();
		ad.find_highest();

	}

	private void find_highest() {
	    // TODO Auto-generated method stub
	int[] marks = {96, 78, 89, 99, 92}; 
	String[] sub = {"Tamil", "English", "Maths", "Science",
	        "Social"}; 
	int index_h = 0; 
	int index_l =0; 
	int highest = marks[0]; //highest = 96
	int lowest = marks[0];
	int i=1; 
	while(i<marks.length)
	{
	  if(marks[i]>highest)
	  {
	    highest = marks[i];
	    index_h = i; 
	  }
	  if(marks[i]<lowest)
	  {
	    lowest = marks[i];
	    index_l = i; 
	  }
	  i++;
	}

	System.out.println("Highest mark is "+ highest + " from "+ sub[index_h]);
	System.out.println("Lowest mark is "+ lowest + " from "+ sub[index_l]);
	}

	private void learn_array2() {
		// TODO Auto-generated method stub
		int[] nandhini= {100,100,100,100,100,100};
		int i=0;
		while(i<6)
		{	
		System.out.println(nandhini[i]);
		i++;
		}
	}
		
		private void calculate_percentage() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("How many Subjects? ");
			int sub_count = sc.nextInt(); //5
			int[] marks = new int[sub_count];
			int total = 0; 
			int i = 0; 
			while(i<marks.length)
			{
				System.out.println("Enter Mark ");
				marks[i] = sc.nextInt(); 
				total = total + marks[i];
				i++; 
			}
			System.out.println("Your total is "+ total);
			float percentage = total/sub_count;
			System.out.println("Percentage :" +percentage);
		
	}

	private void learn_array1() {
		// TODO Auto-generated method stub
		int[] marks=new int[6];
		marks[0]=100;
		marks[1]=90;
		marks[2]=80;
		
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		//System.out.println(marks[6]);
		
	}

}
