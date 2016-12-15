package edu.csus.cs206.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {
	
	@Test
	public void testNodeCreation() {
		Node n = new Node(10);
		
		assertEquals(10, n.getData());
		assertEquals(null, n.getNext());
	}
}
