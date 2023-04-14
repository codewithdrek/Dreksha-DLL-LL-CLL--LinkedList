package com.DLL;


// to make this prog 3 class needed, one model,one all methods class, one test class , model class will not be seprate it will inner class , with 2 const 
public class CustomDoublyLL {
	int size;
	Node head;
	Node tail;

	public CustomDoublyLL() {

		this.size = 0;
	}

	// ALl METHOD WILL BE IN OUTER CLASS

	// METHOD 1: Insert Node at first
	public void insertAtFirst(int val) {
		Node node = new Node(val);// mad my Node
		node.next = head;// to retain my next node ,otherwise data will be lost
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;// node is equal to my node

	}

	// METHOD 2

	public void display() {
		Node temp = head;// let say first node we get by putting =head ,then run node +1 by doing node=
							// node.next
		while (temp != null) {
			// node is not null then print node value
			System.out.print(temp.value);

			System.out.print("->");

			// and move node one step ahead
			temp = temp.next;// if condition we do i++
		}

		System.out.println("END ");
	}

	// METHOD 3 REVERSE
	public void displayReverse() {
		Node temp = head;
		Node last = null;

		// this While loo run temp as a node one by one to next reached till end
		// hensce last var which is of type NODE reaches till last Node with temp
		while (temp != null) {
			System.out.println(temp.value);
			last = temp; // by this loop last var will be reached till END NUMBER IN OUR DLL ie (6) will
							// move till END
			temp = temp.next;
		}

// this while loop is only for printing last.prev value if last is not null
		// after printing shift last to one num prev
		while (last != null) {
			System.out.print(last.value);
			System.out.print("->");
			last = last.prev;

		}
		System.out.println("START");
	}

	// METHOD 4
	public void insertLast(int val) {
		
		//Step 1 make my Node with passed val
		Node myNode=new Node(val);
		Node last =head;//move last var as tail is not given , also iterate last var with head
		myNode.next=null;//byDefault ==null irrespectivly always
		
		//PLEAS NOTE last.next will give wrroe if Head is null
		if (head == null) {// it mean no ll element present
			myNode.prev=null;
			head=myNode;
			return;// dont need to move forward
		}
		//last is moving one by one till it is not finding NUll
		while (last.next !=null) { 
			last=last.next;
		}
		
		last.next=myNode; //if last reached to end whome it will be pointing definatly to our new node
	    myNode.prev=last;
	}

	
	


	// METHOD 5
  public void insertAfterIndex(int after,int val) { //after is the node after which val is to be inserted
	  Node p = findNodeOfThisVal(after);
	  if(p == null) {
		  System.out.println("P Node does't access");
	  }
	  //Create first my Node 
	  Node myNode= new Node(val);
	  myNode.next=p.next;
	  myNode.prev=p;
	  p.next=myNode;
	  
	  //myNode.next//currently it is 4 befre that my node will insert).prev (4 ka prev my node ban jaye)
	 // myNode.next.prev=myNode;//it may be null myNode.next
	  if (myNode.next !=null) {
		  myNode.next.prev=myNode;
	  }
  }
	
	

	private Node findNodeOfThisVal(int val) {

		//Traversing required hence take temp var
		Node temp = head;
		while (temp!=null) {
			if(temp.value == val) {
				System.out.println("Node found"+"  "+ val +"is equal to "+temp.value);
			return temp;
			}
			temp=temp.next;
		}
		return null;//no temp return default value of node is null if not found else sys out above 
	}



	// Private class Node As a model ,Obje in DLL
	public class Node {
		Node prev;
		Node next;
		int value;

		public Node(int value) {
			this.value = value;
		}

		public Node(Node prev, Node next, int value) {
			this.prev = prev;
			this.next = next;
			this.value = value;
		}

	}

}
