package com.test.operators;

public class TestingJavaOperators {
	public static void main(String[] args) {

		testAndOrOperators();
		// testShiftOperators();
		// testBitwiseOperators();

	}

	private static void testBitwiseOperators() {
		System.out.println(2 | 3);
		System.out.println(2 & 3);
		System.out.println(~(-10));
		System.out.println(2 ^ 3);

	}

	private static void testShiftOperators() {
		int a = 13;
		int b = -13;

		System.out.println("a->" + (a >> 2));
		System.out.println("a->" + (a << 2));
		System.out.println("a->" + (a >>> 2));

		System.out.println("b->" + (b >> 2));
		System.out.println("b->" + (b << 2));
		System.out.println("b->" + (b >>> 2));

	}

	private static void testAndOrOperators() {
		int a = 3;
		int b = 4;

		b = b++;
		System.out.println(b);
		
		System.out.println((-3)%(-8));
		System.out.println((-3)%(8));
		System.out.println((3)%(8));
		System.out.println((3)%(-8));
		
		

		if (a++ > 5 || a++ >= 4) {
			System.out.println("1");
		}
		System.out.println("a->" + a);
		System.out.println("a->" + a++);
		System.out.println("a->" + ++a);

		if (b++ > 3 || b++ > 5) {
			System.out.println("2");
		}
		System.out.println("b->" + b);

		a = 3;
		b = 4;

		if (a++ > 5 | a++ <= 4) {
			System.out.println("3");
		}
		System.out.println("a->" + a);

		if (b++ > 3 | b++ > 5) {
			System.out.println("4");
		}
		System.out.println("b->" + b);

		a = 3;
		b = 4;

		if (++a > 5 | ++a <= 4) {
			System.out.println("3");
		}
		System.out.println("a->" + a);

		if (++b > 3 | ++b > 5) {
			System.out.println("4");
		}
		System.out.println("b->" + b);

		System.out.println("===================================");

		a = 3;
		b = 4;

		if (a++ > 5 && a++ >= 4) {
			System.out.println("1");
		}
		System.out.println("a->" + a);
		System.out.println("a->" + a++);
		System.out.println("a->" + ++a);

		if (b++ > 3 && b++ >= 5) {
			System.out.println("2");
		}
		System.out.println("b->" + b);

		a = 3;
		b = 4;

		if (a++ > 5 & a++ <= 4) {
			System.out.println("3");
		}
		System.out.println("a->" + a);

		if (b++ > 3 & b++ > 5) {
			System.out.println("4");
		}
		System.out.println("b->" + b);
	}

}
