package com.saya.interfacedemo;

import java.util.*;

public class LinkTest {

	public static void main(String[] args) {
		LinkedList<String> lin= new LinkedList<String> ();
		
lin.add("one");
lin.add("two");
lin.add("three");

Iterator<String> itr=lin.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}


}}
