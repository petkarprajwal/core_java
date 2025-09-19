package org.tnsif.sf.c2tc.collections_demo;
import java.util.Vector;
import java.util.List;


public class VectorsDemo {

		public static void main(String[] args) {
			List<String> fruits=new Vector<>();
			
			
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("cherry");
			fruits.add("cherry");
			
			//access element
			
			System.out.println("First fruit :"+ fruits.get(0));
			
			//modify an element
			
			fruits.set(2, "Blueberry");
			
			//remove an element
			
			fruits.remove("cherry");
			
			//check if an element exists
			
			if(fruits.contains("Apple"))
			{
				System.out.println("apple is in the list");
			}
	 
			//print all the element using for-each loop
			
			System.out.println("Fruits in the list");
			
			for(String fruit:fruits)
			{
				System.out.println(fruit);
			}
			
			
			System.out.println("Number of fruits "+fruits.size());
			
			//clear all the elements
			
			fruits.clear();
			
			System.out.println("List cleared " +fruits.size());
		}

}


