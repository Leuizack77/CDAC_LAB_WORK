package com.demo.interfaces;

public interface Inter1 {
	int m1();
	void m2(int i);
	int i = 12;
	
	private void m5() {
		System.out.println("In Same odf m3 and m4");	
	}
	
	private void m3() {
		m5();
		System.out.println("in m3 method");
		//return 10;
	}
	
	private void m4() {
		m5();
		System.out.println("in m4 method");
		//return 20;
	}
	
	public static void myfunct1() {
		System.out.println("in myfunct1");
	}
	
}
