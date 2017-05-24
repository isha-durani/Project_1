package com.arithmetic;

public class Final_calculation {

	public static void main(String[] args) {
		int add=addition();
		int sub=subtraction();
		int mul=multiplication();
		int div=division();

		System.out.println("value of addition of 2 integers : "+add);
		System.out.println("value of subtraction of 2 integers : "+sub);
		System.out.println("value of multiplication of 2 integers : "+mul);
		System.out.println("value of division of 2 integers : "+div);
	}

	public static int addition() {
		int a = 5;
		int b= 10;
		int c = a+ b;
		return c;
	}
	public static int subtraction() {
		int a = 20;
		int b = 10;
		int c = a - b;
		return c;
	}
	public static int multiplication() {
		int a = 7;
		int b = 5;
		int c = a*b;
		return c;
	}
	public static int division() {
		int a = 50;
		int b = 5;
		int c = a/b;
		return c;
	}

}
