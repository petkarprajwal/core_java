package org.tnsif.sf.c2tc.execption_handling;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String words=null;
		
		}
		catch(NullPointerException e) {
		System.out.println("Handled");

		}
		finally {
			System.out.println("Finally see");
		}

	}
}
