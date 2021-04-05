package com.introduction;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(getFactorial(n));
		s.close();
		
	}
	public static int getFactorial(int n){
		if(n<=1){
			return 1;
		}else{
			return n*getFactorial(n-1);
		}
	}

}
