package com.introduction;
import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int i=0;
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNext()){
    		i=i+1;
    		String str=sc.nextLine();
    		System.out.println(i+" "+str);
    	}
    	sc.close();
    }
}