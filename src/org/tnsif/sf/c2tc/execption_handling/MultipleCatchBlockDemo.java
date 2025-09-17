package org.tnsif.sf.c2tc.execption_handling;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]=new int[4];
		try {
			numbers[9]=50/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception"+e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array exception "+e.getMessage());
			
		}
		catch(Exception e){
			System.out.println("other exception"+e.getMessage());
			
		}
		

	}

}
