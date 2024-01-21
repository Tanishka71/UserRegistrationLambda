package com.bridgelabz.user;

interface A{
	void show();
}
public class LambdaPractise {
	public static void main(String[] args) {
		A a=()->{System.out.println("Showing A ");};
		a.show();
	}
}
