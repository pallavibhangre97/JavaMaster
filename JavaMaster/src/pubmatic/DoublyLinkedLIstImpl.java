package pubmatic;

public class DoublyLinkedLIstImpl {
	static Node headNode;

	static class Node {

		Node next;
		Node previous;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}

	public static void main(String[] args) {

		headNode = new Node(90);

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		headNode.next = node1;
		node1.previous = headNode;
		headNode.next.next = node2;
		node2.previous = headNode.next;

		// print(headNode);
		insertAtBeginning(80);
		System.out.println();
		// print(headNode);
		insertAtEnd(10);
		insertAtPosition(12, 5);
		print(headNode);
	}

	private static void insertAtPosition(int data, int position) {

		int pos = 1;
		Node node = new Node(data);
		Node currentNode = headNode;
		if (position == 1) {
			insertAtBeginning(data);
		}

		while (currentNode != null && pos < position) {
			currentNode = currentNode.next;
			pos++;
		}

		if (currentNode == null) {
			System.out.println("position not found");
		} else {
			node.next = currentNode;
			node.previous = currentNode.previous;
			currentNode.previous.next = node;
			currentNode.previous = node;

		}
	}

	private static void print(Node headNode2) {

		if (headNode2 == null) {
			return;
		} else {
			Node tempNode = headNode2;

			while (tempNode != null) {
				System.out.print(tempNode.data + " ");
				tempNode = tempNode.next;

			}
		}

	}

	private static void insertAtBeginning(int data) {

		Node tenpNode = new Node(data);

		if (headNode == null) {
			headNode = tenpNode;
		} else {
			tenpNode.next = headNode;
			headNode.previous = tenpNode;
			headNode = tenpNode;
		}

	}

	private static void insertAtEnd(int data) {

		Node tempNode = new Node(data);
		Node currentNode = headNode;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = tempNode;
		tempNode.previous = currentNode;

	}

}
