package org.tnsif.sf.c2tc.static_keyword;

class PaymentGateway
{
	static void showSupportedBanks()
	{
		System.out.println("Supported Banks : SBI, HDFC,ICICI,AXis");
	}
}


public class StaticMethod {

	public static void main(String[] args) {
		PaymentGateway.showSupportedBanks();

	}

}
