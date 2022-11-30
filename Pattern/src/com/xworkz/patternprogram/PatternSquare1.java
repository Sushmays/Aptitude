package com.xworkz.patternprogram;

import java.util.Iterator;
import java.util.Scanner;

public class PatternSquare1 {

	public static void main(String[] args) {

//		Scanner scr = new Scanner(System.in);
//		int n = scr.nextInt();

		int n = 5;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

