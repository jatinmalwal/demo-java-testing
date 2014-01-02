package com.test.one;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestingABC {

	public static void main(String[] args) {

		System.out.println("main");

		// Testing123 testing123 = new Testing123();

		try {
			Class c = Class.forName("com.test.java.Testing123");
			Object o = c.newInstance();
			Method m = c.getDeclaredMethod("printMessage", String.class);

			m.setAccessible(true);

			m.invoke(o, "Jatin");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
