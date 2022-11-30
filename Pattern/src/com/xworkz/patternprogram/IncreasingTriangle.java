package com.xworkz.patternprogram;

public class IncreasingTriangle {

	public static void main(String[] args) {

		int n = 6;

		System.err.println("Increasing star");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			/*
			 * for(int j=i;j<=n;j++) { System.out.println(". "); }
			 */

			System.out.println();
		}

		System.err.println("Reducing plus");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}

		System.err.println("================one===================");

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.err.println("==================Two==================");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.err.println("================Three=================");
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.err.println("===============Four===============");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
