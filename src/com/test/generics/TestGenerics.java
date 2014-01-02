package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<? extends Number> l1 = new ArrayList<Number>();
		
		ArrayList<Integer> l2  = new ArrayList<Integer>();
		
		
		l1=l2;
		
		

	}

}
