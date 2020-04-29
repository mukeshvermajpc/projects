package com.pattern;

public class PyramidTwo {
	public static void main(String args[]) {
		System.out.println("program for print pyramid");
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
