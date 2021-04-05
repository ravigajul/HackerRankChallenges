package com.introduction;

import java.util.Scanner;

public class MultiplesOfANumber {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        scanner.close();
	       if(N>=2 && N<=20){
	    	   int i=1;
	    	   while(i<=10){
	    		   System.out.println(N+" x "+i+" = "+ N*i);
	    		   i++;
	    	   }
	       }
	    }
}
