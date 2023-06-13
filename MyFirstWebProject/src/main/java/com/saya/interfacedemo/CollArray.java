package com.saya.interfacedemo;

import java.util.*;

public class CollArray {
	
	
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Hana");
		arr.add("zara");
		arr.add("Azain");
		Iterator itr = arr.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	}
   
}
