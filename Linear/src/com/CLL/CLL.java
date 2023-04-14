
package com.CLL;

public class CLL {

	Node head;
	Node tail;

	public CLL() {
	}

	public CLL(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}

	public void insert(int val) {

		Node myNode = new Node(val);
		if (head == null) {
			head = myNode;
			tail = myNode;
			return;
		}
		myNode.next = head;
		tail.next = myNode;
		// head=myNode;
		tail = myNode;

	}

	public void displayCLL() {
		Node temp = head;
		// 1st way
		if (head != null) {
			// DO WHILE THEORY I HAV EWRITTEN IN NOTES
			// We have to print at least once
			do {
				System.out.print(temp.val + "->");
				temp = temp.next;
			} while (temp != head); // circular loop will run till this condition
		}

		// 2nd way is to peint element from head till tail
		// condition temp == tail then stop but in this case we have to print 17 as well

	}

	public int delete(int val) { // 5 //Y i am passing value check to delete on basis of value
		Node temp = head;

		//condition if deletion node will be my head node
		if (val == temp.val) { // v simple
			head = head.next;
			tail.next = head;
		} 
		
		//in between somewhere i have to delete
		else {
			while (temp != null ) {
				if (val == temp.next.val) {// 5==5 ( myNode.value ==temp.value)
					temp.next = temp.next.next;
					
					return val;
				}
		temp = temp.next;
			}
		}
		return val;
	}

	private class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

}
