package com.test.java;

import com.test.java.Testing234.TestingInterafce;

class Test123 {

//	public static void lele() {
//		System.out.print("PaRENT ");
//	}

	private void printMessage(String name) {
		System.out.println("Hello Java");

		if (name != null) {
			System.out.println("I'm " + name);
		}

		Testing234 testing234 = new Testing234();
		testing234.printMessage(new TestingInterafce() {

			@Override
			public void print(String msg) {
				System.out.println(msg);

			}
		});
	}

}

class Testing345 extends Test123 {

	public static void lele() {
		System.out.print("Child");
	}

}

public class Testing123{
	public static void main(String[] args) {
		
	}
}

