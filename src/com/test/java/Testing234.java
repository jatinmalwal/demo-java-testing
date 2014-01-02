package com.test.java;

public class Testing234 {

	public static interface TestingInterafce {
		public void print(String msg);
	}

	public class TestingClass {

	}

	public void printMessage(TestingInterafce testingInterafce) {
		testingInterafce.print("Hi");
	}

}

