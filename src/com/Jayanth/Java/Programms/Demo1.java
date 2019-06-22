package com.Jayanth.Java.Programms;

public class Demo1 implements Test1 {

	private static Demo1 demo1 = null;

	private Demo1() {
		System.out.println("Conctructor for singleton :");
	}

	public static Demo1 getInstance() {
		if (demo1 == null) {
			demo1 = new Demo1();  
		}
		return null;
	}

	/* Other methods protected by singleton-ness */
	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}

	protected void calmethod(int a, int d) {
		int multi = a * d;
		System.out.println(multi);
	}

	@Override
	public void interfacemethod() {
		// TODO Auto-generated method stub
		
	}
}
