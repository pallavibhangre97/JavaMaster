package pubmatic;

public class ReverseLinkedList {

	public static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void print(Node head) {

		Node tempNode = head;

		while (tempNode != null) {
			System.out.print(tempNode.data + " -> ");
			tempNode = tempNode.next;
		}
	}

	public static Node reverseLinkedList(Node head) {

		Node previous = null;
		Node current = head;
		Node tempNode = null;

		while (current != null) {
			tempNode = current.next;
			current.next = previous;
			previous = current;
			current = tempNode;
		}

		head = previous;
		return previous;
	}

	public static void main(String[] args) {
		Node head = new Node(1);

		Node node1 = new Node(28);
		Node node2 = new Node(3);
		Node node3 = new Node(43);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		System.out.println(" Initial linked list ");
		print(head);

		System.out.println();
		System.out.println(" reverse linked list ");

		head = reverseLinkedList(head);
		print(head);
	}

}
