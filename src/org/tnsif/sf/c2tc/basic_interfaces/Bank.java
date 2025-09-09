package org.tnsif.sf.c2tc.basic_interfaces;

public interface Bank {
	int principal=10000;
	static String Bank_name="RBI";
	void check_balance();
	void see_transaction();
	int min_balance=200;
	
}
