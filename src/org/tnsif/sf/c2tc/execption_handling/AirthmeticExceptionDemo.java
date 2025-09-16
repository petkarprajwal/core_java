package org.tnsif.sf.c2tc.execption_handling;

public class AirthmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50/5;
		System.out.println(a);
		int b=50/10;
		System.out.println(b);
		try {
			int number_three=50/0; //excep
			System.out.println(number_three);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}

		int d=50/25;
		System.out.println(d);
		
		

	}

}
