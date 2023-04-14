package com.CLL;

public class CLLTest {

	public static void main(String[] args) {
		CLL  cll = new CLL();
		cll.insert(1);
		cll.insert(2);
		cll.insert(3);
		cll.insert(4);
		cll.insert(5);
		cll.insert(6);
		
		//cll.displayCLL();
		cll.delete(4);// v simple 
	    cll.displayCLL();
		
	}
}
