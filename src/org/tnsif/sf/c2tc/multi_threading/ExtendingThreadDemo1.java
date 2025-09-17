package org.tnsif.sf.c2tc.multi_threading;


class Eclipse2 extends Thread{
	public void run() {
		System.out.println("Eclipse id"+" "+Thread.currentThread().getId());
	}
	
}
class OneNote2 extends Thread{
	public void run() {
		System.out.println("OneNote id"+" "+Thread.currentThread().getId());
	}
	
}
class Chrome2 extends Thread{
	public void run() {
		System.out.println("Chrome id"+" "+Thread.currentThread().getId());
	}
	
}

public class ExtendingThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse2 obj=new Eclipse2();
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		
		OneNote2 obj1=new OneNote2();
		obj1.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		
		Chrome2 obj2=new Chrome2();
		obj2.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Main Method id"+" "+Thread.currentThread().getId());
		

	}

}



