package org.tnsif.sf.c2tc.collections_demo;

import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new LinkedList<>();
		fruits.add("apple");
		fruits.add("Mango");
		fruits.add("Dragon Fruit");
		
		System.out.println("First Fruit: "+fruits.get(0));
		
		fruits .set(2,"cherry");
		
		if(fruits.contains("apple"))
		{
			System.out.println("Apple is in the list");
		}
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		fruits.remove(2);
		
		fruits.clear();
		System.out.println("Cleared number of fruits"+fruits.size());
		System.out.println(fruits);

		

	}

}
