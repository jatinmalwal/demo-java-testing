package com.test.string;

public class MyStringTesting {

	public static void main(String[] args) {

		// testPoolAndEquals();

		// testSubstring();

		testStringBuffer();

	}

	private static void testStringBuffer() {
		StringBuffer sb1 = new StringBuffer("Hello Java ");
		sb1.append("I'm Jatin!");
		System.out.println(sb1);

	}

	public static void testPoolAndEquals() {

		System.out.println("========================");

		String a = "hello";

		String b = new String("hello");

		String c = "hello";

		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println(a.equals(c));

		String s1 = a + " world";
		String s2 = c + " world";
		String s3 = a.concat(" world");
		String s4 = c.concat(" world");
		System.out.println("========================");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		System.out.println(s2 == s4);
		System.out.println(s2.equals(s4));

	}

	public static void testSubstring() {
		String s1 = "NAVJOTSINGHBEDI";
		String s2 = (String) s1.subSequence(3, 7);
		String s3 = (String) s1.substring(3, 7);
		String s4 = (String) s1.substring(3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
