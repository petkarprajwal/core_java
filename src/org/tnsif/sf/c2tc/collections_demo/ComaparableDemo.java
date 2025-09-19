package org.tnsif.sf.c2tc.collections_demo;

import java.util.ArrayList;
import java.util.Collections;

class Person6 implements Comparable<Person6>{
	String name;
	int age;
	
	public Person6(String name, int age) {
		super();
		this.name=name;
		this.age=age;
		
	}
	void display() {
		System.out.println("Nmae:"+name +"age"+age);
	}
	public int compareTo(Person6 other) {
		return this.name.compareTo(other.name);
	}
}
public class ComaparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person6> people=new ArrayList<>();
		people.add(new Person6("John",26));
		people.add(new Person6("Anil",71));
		people.add(new Person6("Ram",19));
		people.add(new Person6("Prajwal",23));
		
		Collections.sort(people);
		
		for(Person6 p:people) {
			p.display();
		}
		
	
	}

}
