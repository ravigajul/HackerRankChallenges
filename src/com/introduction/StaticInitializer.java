package com.introduction;

import java.util.Scanner;

public class StaticInitializer {
	static int B;
	static int H;
	static boolean flag = false;
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if ((B >= -100 && B <= 100) && (H >= -100 && H <= 100)) {
			if (B > 0 && H > 0) {
				flag = true;
			} else {
				System.out.println("java.lang.Exception: Breadth and height must be positive");

			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
