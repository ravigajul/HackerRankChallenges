package com.introduction;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			if (n >= 1 && n <= 15) {
				int c = a;
				for (int k = 0; k < n; k++) {
					c = c + (int) Math.pow(2, k) * b;
					System.out.print(c + " ");
				}
				System.out.println();
			}
		}
		in.close();
	}

}
