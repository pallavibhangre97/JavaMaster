package pubmatic;

public class ReverseAnyTwoNode {

	static class Node {

		int data;
		Node nextNode;

		Node(int data) {

			this.data = data;
			this.nextNode = null;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(9);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		head.nextNode = node1;
		node1.nextNode = node2;
		node2.nextNode = node3;
		node3.nextNode = node4;
		node4.nextNode = node5;

		reverseAnyTwoNode(head, 5);
		System.out.println();

	}

	private static void print(Node head) {

		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.nextNode;
		}

	}

	private static void reverseAnyTwoNode(Node head, int firstPosition) {
		System.out.println("linked list before swaping ");

		print(head);

		Node currentNode = null;
		Node previousNode = null;
		Node next = null;

		if (firstPosition == 1) {

			currentNode = head.nextNode;
			next = currentNode.nextNode;

			currentNode.nextNode = head;
			head.nextNode = next;
			head = currentNode;
			System.out.println();
			System.out.println("linkes list after swapping");
			System.out.println();
			print(head);
			return;
		}

		previousNode = head;
		int c = 1;

		while (c != (firstPosition - 1)) {
			previousNode = previousNode.nextNode;
			c++;
		}
		int size = Size(head);
		if (c == (size - 2)) {
			currentNode = previousNode.nextNode;
			next = currentNode.nextNode;
			previousNode.nextNode = next;
			next.nextNode = currentNode;
			currentNode.nextNode = null;
			System.out.println();
			System.out.println("after swaping last node");
			print(head);
		}

		currentNode = previousNode.nextNode;
		next = currentNode.nextNode;
		currentNode.nextNode = next.nextNode;
		previousNode.nextNode = next;
		next.nextNode = currentNode;

	}

	private static int Size(Node head) {

		int size = 0;
		Node tempNode = head;
		while (tempNode != null) {
			tempNode = tempNode.nextNode;
			size++;
		}
		return size;
	}

}
