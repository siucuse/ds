package edu.csus.cs206.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LinkedListTest {
	@Test
	public void testEmptyListCreation() {
		LinkedList l = new LinkedList();
		assertEquals(null, l.getRoot());
	}
}
