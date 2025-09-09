package org.tnsif.sf.c2tc.basic_interfaces;
class status implements TrainData{

	@Override
	public void train_on_time() {
		// TODO Auto-generated method stub
		System.out.println("train is before time");
		
	}

	@Override
	public void train_delay() {
		// TODO Auto-generated method stub
		System.out.println("train is delay");
	}

	@Override
	public void arrival() {
		// TODO Auto-generated method stub
		System.out.println("train arrived ");
		
	}

	@Override
	public void depature() {
		// TODO Auto-generated method stub
		System.out.println("train  will be departing");
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainData obj=new status();
		obj.arrival();
		obj.depature();
		obj.train_on_time();
		obj.train_delay();
		

	}

}
