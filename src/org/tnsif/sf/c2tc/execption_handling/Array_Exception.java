package org.tnsif.sf.c2tc.execption_handling;
import java.util.Scanner;
public class Array_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3]; 
		Scanner sc=new Scanner(System.in);
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
		
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
			
		}
		try {
			int i =a[6];
			System.out.println(i);
			
		}
		catch(ArrayIndexOutOfBoundException e) {
			System.out.println(e);
		}
		
		
	}

}
