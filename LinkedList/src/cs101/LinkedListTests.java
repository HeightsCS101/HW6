package cs101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTests {

	@Test
	void nodeAdd() {
		Node a = new Node("a");
		a.add("b");
		assert (a.getNext().getData().equals("b"));

		a.add("c");
		assert (a.getNext().getNext().getData().equals("c"));

	}

	@Test
	void nodeFind() {
		Node a = new Node("a");
		a.add("b");
		a.add("c");

		assert (a.find("c").getData().equals("c"));
		assert (a.find("d") == null);
		assert (a.find("a").getData().equals("a"));
		assert (a.find("b").getData().equals("b"));

	}

	@Test
	void nodeDelete() {
		Node a = new Node("a");
		a.add("b");
		a.add("c");

		assert (true == a.delete(a, "b"));
		assert (a.find("a").getData().equals("a"));
		assert (a.find("c").getData().equals("c"));
		assert (a.getNext().getData().equals("c"));
		assert (a.find("b") == null);

		Node d = new Node("d");
		d.add("e");
		d.add("f");

		assert (true == d.delete(d, "f"));
		assert (d.find("d").getData().equals("d"));
		assert (d.find("e").getData().equals("e"));
		assert (d.getNext().getData().equals("e"));
		assert (d.getNext().getNext() == null);
		assert (a.find("f") == null);

		assert (false == d.delete(d, "h"));

	}

	@Test
	void listConstructorAndSize() {
		LinkedList m = new LinkedList();
		assertEquals(null, m.getHead());
		assertEquals(0, m.size());

	}

	@Test
	void listAdd() {
		LinkedList m = new LinkedList();
		m.add("a");
		assert (m.getHead().getData().equals("a"));
		m.add("b");
		assert (m.getHead().getData().equals("a"));
		assert (m.getHead().getNext().getData().equals("b"));
		m.add("c");
		assert (m.getHead().getData().equals("a"));
		assert (m.getHead().getNext().getData().equals("b"));
		assert (m.getHead().getNext().getNext().getData().equals("c"));

	}

	@Test
	void listFind() {
		LinkedList m = new LinkedList();
		m.add("a");
		m.add("b");
		m.add("c");
		assert (m.find("c").getData().equals("c"));
		assert (m.find("a").getData().equals("a"));
		assert (m.find("a").getNext().getData().equals("b"));
		assert (m.find("f") == null);
		m.add("f");
		assert (m.find("f").getData().equals("f"));
	}

	@Test
	void listDelete() {
		LinkedList m = new LinkedList();
		m.add("a");
		m.add("b");
		m.add("c");
		assertEquals(true, m.delete("b"));
		assert (m.getHead().getNext().getData().equals("c"));
		assertEquals(false, m.delete("d"));

		LinkedList b = new LinkedList();
		assertEquals(false, b.delete("b"));
	}

	@Test
	void listDeleteHead() {
		LinkedList m = new LinkedList();
		m.add("a");
		m.add("b");
		m.add("c");
		assertEquals(true, m.delete("a"));
		assert (m.getHead().getData().equals("b"));
		assert (m.getHead().getNext().getData().equals("c"));
	}

	@Test
	void listSize() {
		LinkedList m = new LinkedList();
		assertEquals(0, m.size());
		m.delete("a");
		assertEquals(0, m.size());
		m.add("a");
		m.add("b");
		m.add("c");
		assertEquals(3, m.size());
		m.delete("b");
		assertEquals(2, m.size());
		m.delete("a");
		assertEquals(1, m.size());
		m.delete("p");
		assertEquals(1, m.size());

	}

}
