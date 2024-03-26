package pubmatic;

public class RemoveAtPosition {

	static class Node {

		int data;
		Node nextNode;

		Node(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public static Node removeDataNode(int data, Node headNode)// remove node of given element from list
	{

		if (headNode.data == data) {
			headNode = headNode.nextNode;
			return headNode;
		}

		Node previous = headNode;
		Node tempNode = headNode.nextNode;
		boolean flag = false;
		while (tempNode != null) {

			if (tempNode.data == data) {
				previous.nextNode = tempNode.nextNode;
				flag = true;
				break;
			}
			previous = tempNode;
			tempNode = tempNode.nextNode;

		}
		if (flag == false) {
			System.out.println("element not found");
		}
		return headNode;

	}

	public static void main(String[] args) {

		Node headNode = new Node(1);

		Node node1 = new Node(7);
		Node node2 = new Node(90);
		Node node3 = new Node(67);

		headNode.nextNode = node1;
		node1.nextNode = node2;
		node2.nextNode = node3;

		headNode = removeDataNode(10, headNode);
		print(headNode);

	}

	private static void print(Node headNode) {

		if (headNode == null) {
			System.out.println("linked list is empty");
			return;

		}

		Node temp = headNode;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.nextNode;
		}
	}

}
