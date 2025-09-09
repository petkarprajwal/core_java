package org.tnsif.sf.c2tc.basic_interfaces;

class emailNotification implements NotificationService{

	@Override
	public void notifyUser(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending email:"+ message);
	}
	
}
class SMSNotification implements NotificationService{

	@Override
	public void notifyUser(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending sms:"+ message);
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emailNotification obj3=new emailNotification();
		SMSNotification obj4=new SMSNotification();
		obj3.notifyUser("hi");
		obj4.notifyUser("hello");
	}

}
