package org.tnsif.sf.c2tc.basic_wrapper_class;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=1;
		Byte wb=b;
		System.out.println("autoboxed byte"+wb);
		
		byte ub=wb;
		System.out.println("unboxed byte"+ub);

		
		short s=1;
		Short ws=s;
		System.out.println("autoboxed short"+ws);
		
		short us=ws;
		System.out.println("unboxed short"+us);
		
		int i=1;
		Integer wi=i;
		System.out.println("autoboxed integer"+wi);
		
		int ui=wi;
		System.out.println("unboxed byte"+ui);
		
		long l=1000000000;
		Long wl=l;
		System.out.println("autoboxed long"+wl);
		
		long ul=wl;
		System.out.println("unboxed long"+ul);
		
		float f=1.0f;
		Float wf=f;
		System.out.println("autoboxed float"+wf);
		
		float uf=wf;
		System.out.println("unboxed float"+uf);
		
		double d=1.0000000;
		Double wd=d;
		System.out.println("autoboxed Double"+wd);
		
		double ud=wd;
		System.out.println("unboxed Double"+ud);
		
		char c='a';
		Character wc=c;
		System.out.println("autoboxed character"+wc);
		
		char uc=wc;
		System.out.println("unboxed character"+uc);
		
		boolean bo=true;
		Boolean wbo=bo;
		System.out.println("autoboxed boolean "+wbo);
		
		boolean ubo=wbo;
		System.out.println("unboxed boolean "+ubo);
		
		
	}

}
