package cs101;

// TODO: implement NodeInterface
public class Node {

	private String data;
	private Node next;

	// constructor
	public Node(String new_data) {
		this.data = new_data;
		next = null;
	}

	// helper code, do not modify
	public String getData() {
		return this.data;
	}

	// helper code, do not modify
	public Node getNext() {
		return this.next;
	}

	// helper code, do not modify
	public String toString() {
		if (this.next == null) {
			return "[ data: " + data + " ]";
		} else {
			return "[ data: " + data + " ], " + next.toString();
		}

	}

	// TODO: add your NodeInterface functions here

}
