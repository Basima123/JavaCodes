
package com.saya.interfacedemo;

import java.util.*;

public class VectorTest {
	public static void main (String[] args) {
	
Vector<String> v =new Vector<String>();
v.add("second");
v.add("first");
v.add("third");
Iterator<String> itr=v.iterator();
while(itr.hasNext())
{System.out.println(itr.next());}

}}
