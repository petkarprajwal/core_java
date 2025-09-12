package org.tnsif.sf.c2tc.basic_interfaces;

interface Task{
	void book_ticket();
	void search_availability();
	String name="IRCTC";
	default void app_feature() {
		System.out.println("This is basically a booking app");
	}
	static void name_app() {
		System.out.println("APP Name"+ name);
	}
	
}
class Train implements Task{

	@Override
	public void book_ticket() {
		// TODO Auto-generated method stub
		System.out.println("train tickect booking");
		
	}

	@Override
	public void search_availability() {
		System.out.println("train seats available status");
		
	}
	
}
class Flight implements Task{

	@Override
	public void book_ticket() {
		// TODO Auto-generated method stub
		System.out.println("Flight tickect booking");
		
	}

	@Override
	public void search_availability() {
		System.out.println("Flight seats available status");
		
	}
	
}
class Hotel implements Task{

	@Override
	public void book_ticket() {
		// TODO Auto-generated method stub
		System.out.println("Hotel tickect booking");
		
	}

	@Override
	public void search_availability() {
		System.out.println("Room available status");
		
	}
	
}
public class booking_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1=new Train();
		Task t2=new Flight();
		Task t3=new Hotel();
		
		Task.name_app();
		t1.book_ticket();
		t1.search_availability();
		
		t2.book_ticket();
		t2.search_availability();
		
		t3.book_ticket();
		t3.search_availability();
		
		t1.app_feature();
		t2.app_feature();
		t3.app_feature();
		
		

	}

}
