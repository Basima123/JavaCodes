package com.saya.interfacedemo;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String> ();
		s.push("cat");
		s.push("dog");
s.push("Lion");
s.push("tiger");
s.push("horse");
s.pop();
Iterator<String> itr=s.iterator();
while(itr.hasNext())
{System.out.println(itr.next());}
}

}
