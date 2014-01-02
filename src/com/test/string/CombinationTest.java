package com.test.string;

public class CombinationTest {

	public static void main(String[] args) {
		String s = "ABC";
		combine(s, new StringBuffer(), 0);
		printCombinationIndex(s, new StringBuffer(), 0);

	}

	static void combine(String instr, StringBuffer outstr, int index) {
		for (int i = index; i < instr.length(); i++) {
			outstr.append(instr.charAt(i));
			System.out.println(outstr);
			combine(instr, outstr, i + 1);
			outstr.deleteCharAt(outstr.length() - 1);
		}
	}

	static void printCombinationIndex(String instr, StringBuffer outstr, int index) {
		for (int i = index; i < instr.length(); i++) {
			outstr.append(i + "");
			System.out.println(outstr); // Here prints all the indexes of combination
			printCombinationIndex(instr, outstr, i + 1);
			outstr.deleteCharAt(outstr.length() - 1);
		}
	}

}
