package org.tnsif.sf.c2tc.basic_interfaces;

class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("light on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("light off");
	}

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		System.out.println("light condition");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice obj= new SmartLight();
		obj.turnOn();
		obj.turnOff();
		obj.getStatus();
		

	}

}
