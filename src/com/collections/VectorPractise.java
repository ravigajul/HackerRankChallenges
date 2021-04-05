package com.collections;

import java.util.Vector;

public class VectorPractise {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(3);
		
		//This print 10, the initial capacity
		System.out.println(v.capacity());
		v.add(5);
		v.add(20);
		v.add(15);
		v.add(1);
		v.add(3);
		v.add(5);
		v.add(20);
		v.add(15);
		
		//This also prints 10
		System.out.println(v.capacity());
		v.add(15);
		
		//This prints20 double initial capacity since the number of elements are now 11, one more than the initial 10 capacity
		System.out.println(v.capacity());
	}

}
