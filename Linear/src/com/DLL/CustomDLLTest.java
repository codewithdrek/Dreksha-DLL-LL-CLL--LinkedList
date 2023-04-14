package com.DLL;


public class CustomDLLTest {

	public static void main(String[] args) {
		
		CustomDoublyLL dll= new CustomDoublyLL();
		dll.insertAtFirst(6);
		dll.insertAtFirst(5);
		dll.insertAtFirst(4);
		dll.insertAtFirst(3);
		dll.insertAtFirst(2);
		dll.insertAtFirst(1);
		
		dll.display();
		//dll.displayReverse();
		
		dll.insertLast(10);
		dll.display();
		dll.insertAfterIndex(3, 100);
		dll.display();
	} 
}
