package datastructure;
//operation 

//reverse link list 
//delete -start ,end ,position ,by value
//insert -start ,end, position 
//instead of sending headnode to all function make it instance var in linkedlist1 class see linkedList2.java
public class LinkedList1 {
	static class Node {// This inner class is made static
		// so that main() can access it
		int data;
		Node nextNode;

		public Node(int data) {
			this.data = data;
			this.nextNode = null;
		}

		Node() {

		}
	}

	public static void main(String[] args) {
		Node headNode = new Node(1);

		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		Node node6 = new Node(7);
		Node node7 = new Node(8);
		headNode.nextNode = node1;
		node1.nextNode = node2;
		node2.nextNode = node3;
		node3.nextNode = node4;
		node4.nextNode = node5;
		node5.nextNode = node6;
		node6.nextNode = node7;
		node7.nextNode = null;

		LinkedList1 linkedList = new LinkedList1();
//inserting at start
		headNode = linkedList.insertStart(headNode);
		// Printing linked list
		linkedList.print(headNode);
		// inserting at end
		linkedList.insertEnd(headNode);
		// insert At position
		linkedList.size(headNode);
		linkedList.insertAtPosition(headNode, 3);
		// Printing linked list
		linkedList.print(headNode);
		linkedList.size(headNode);

		// delete first
		linkedList.deleteStart(headNode);
		linkedList.print(headNode);
	}

	public void print(Node headNode) {
		System.out.println("in print method ");
		Node h1 = new Node();
		h1 = headNode;
		while (h1 != null) {
			System.out.print(h1.data + " ");
			h1 = h1.nextNode;
		}
		System.out.println();

	}

	public Node insertStart(Node headNode) {
		// System.out.println("in insertstart method ");
		Node h2 = new Node();
		if (headNode == null) {
			headNode = h2;

		} else {
			h2.nextNode = headNode;
			headNode = h2;
		}

		return headNode;
	}

	public void insertEnd(Node headNode) {
		Node newNode = new Node(11);
		if (headNode == null) {
			headNode = newNode;
		}
		Node tempNode = headNode;

		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		tempNode.nextNode = newNode;

	}

	public void insertAtPosition(Node headNode, int position) {
		Node tempNode = headNode;
		int count = 1;// becoz link list does not start from 0
		while (count < position - 1) {
			count++;
			tempNode = tempNode.nextNode;
		}

		Node newNode = new Node(888);
		newNode.nextNode = tempNode.nextNode;
		tempNode.nextNode = newNode;

	}

	public void size(Node headNode)

	{
		int count = 0;
		Node tempNode = headNode;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.nextNode;
		}
		System.out.println("Size of linkList : " + count);
	}

	public void deleteStart(Node headNode) {
		Node tempNode = headNode;
		headNode = headNode.nextNode;
		tempNode = null;

	}
}
