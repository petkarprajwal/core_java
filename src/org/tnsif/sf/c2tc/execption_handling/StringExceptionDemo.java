package org.tnsif.sf.c2tc.execption_handling;

import java.util.Scanner;
public class StringExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				String str[]=new  String[5];  
				Scanner sc=new Scanner(System.in);
		        str[0] = sc.next();
		        str[1] = sc.next();
		        str[2] = sc.next();

					
				try {
					char ch=str.charAt(6);
					System.out.println(i);
					
				}
				catch(StringIndexOutOfBoundsException e) {
					System.out.println(e);
				}
				finally {
					System.out.println("hi");
				
				
			}

		}


	}

}
