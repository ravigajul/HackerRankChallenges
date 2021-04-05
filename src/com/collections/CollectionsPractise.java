package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsPractise {
	
  public static void main(String[] args) {
	List<Integer> values= new ArrayList<>();
	values.add(2);
	values.add(3);
	values.add(99);
	values.add(25);
	values.add(20);
	
	//This will print it in the same order as added
	System.out.println(values);
	
	//This will sort the elements in ascending order
	java.util.Collections.sort(values);
	System.out.println(values);
	
	for (Integer integer : values) {
		System.out.println(integer);
		
	}
}

}
