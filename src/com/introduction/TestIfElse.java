package com.introduction;

import java.util.Scanner;

/*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format
A single line containing a positive integer, .

Constraints
1<=n<=100
Output Format
Print Weird if the number is weird; otherwise, print Not Weird.*/
public class TestIfElse {
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	 int N = scanner.nextInt();
     scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
     if(N%2==1){
    	 System.out.println("Weird");
     }else if(N%2==0 && (N>=2&&N<=5)){
    	 System.out.println("Not Weird");
     }else if(true){
    	 
     }
     
     scanner.close();
}
}
