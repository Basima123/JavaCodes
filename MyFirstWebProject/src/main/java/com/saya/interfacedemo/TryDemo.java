package com.saya.interfacedemo;

public class TryDemo {

	public static void main(String[] args) {

		System.out.println();

		// System.out.println(a[5]);

		try {
			try {
				int a = 5;
				int b = 0;
				int c = a / b;
				System.out.println(c);

			} catch (Exception e) {
				e.printStackTrace();

			}
			
			int a1[] = new int[5];
			System.out.println(a1[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		}
	}
}