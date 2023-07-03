package datastructure;

public class LinkedList {
	public static class Node {
		int data;
		Node nextNode;
	}

	public static void main(String[] args) {
		Node headNode = new Node();

		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		headNode.data = 1;
		headNode.nextNode = node1;

		node1.data = 2;
		node1.nextNode = node2;

		node2.data = 3;
		node2.nextNode = node3;

		node3.data = 4;
		node3.nextNode = node4;

		node4.data = 5;
		node4.nextNode = node5;

		node5.data = 6;
		node5.nextNode = null;

		Node node6 = new Node();
		node6 = headNode;
		System.out.println("Linked list ");
		print(node6);
		// insertion operation
		insertFront(node6);
		insertBack(node6);
		InsertPosition(node6);
	}

	private static void InsertPosition(Node n) {
		// TODO Auto-generated method stub

	}

	private static void insertBack(Node n) {
		// TODO Auto-generated method stub

	}

	private static void insertFront(Node n) {
		// TODO Auto-generated method stub

	}

	public static void print(Node n) {
		while (n != null) {
			System.out.println(n.data);
			n = n.nextNode;
		}

	}

}
