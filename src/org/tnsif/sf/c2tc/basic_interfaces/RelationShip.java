package org.tnsif.sf.c2tc.basic_interfaces;
class mother implements Family{

	@Override
	public void relation() {
		System.out.println("she is a mother to child");
		
	}
	
}
class father implements Family{

	@Override
	public void relation() {
		System.out.println("he is a father to child");
		
	}
	
}
public class RelationShip {
	public static void main(String[] args) {
		Family o=new mother();
		Family o1=new father();
		
		o.relation();
		o1.relation();
		
	}
}
