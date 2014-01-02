package com.test.string;

import java.util.Scanner;

public class Solution {
	static int maxCount = 0;
	static String s1;
	static String s2;
	static char temp;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		s1 = "AA";// sc.nextLine();
		s2 = "BB";// sc.nextLine();
		System.out.println("" + combine(new StringBuffer(), 0));

	}

	static int combine(StringBuffer outstr, int index) {
		for (int i = index; i < s1.length(); i++) {
			outstr.append(s1.charAt(i));
			System.out.println(outstr);
			int count = 0;
			int track = 0;
			for (int pointer = 0; pointer < outstr.length(); pointer++) {
				temp = s1.charAt(i);
				for (int j = track; j < s2.length(); j++) {
					if (temp == s2.charAt(j)) {
						System.out.println(temp);
						track = j + 1;
						count++;
						break;
					}
				}
				if (track == s2.length()) {
					break;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
			combine(outstr, i + 1);
			outstr.deleteCharAt(outstr.length() - 1);
		}
		return maxCount;
	}
}