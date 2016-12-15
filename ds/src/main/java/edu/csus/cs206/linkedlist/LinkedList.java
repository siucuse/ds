package edu.csus.cs206.linkedlist;

public class LinkedList {
	private Node root = null;
	
	/**
	 * Returns root node of
	 * the linked list.
	 * 
	 * @return root node.
	 */
	public Node getRoot() {
		return root;
	}


	/**
	 * Add an element to the end of the linked list.
	 * If this is the first Node to be inserted into
	 * the list then the root element is updated to
	 * point to the first node that is inserted. 
	 * If the list is not empty then the new Node will
	 * be added to the end of the list.
	 * 
	 * @param value
	 */
	public void addNode(int value) {
		Node n = new Node(value);
		
		// Root will be 'null' only when
		// the list is empty so when we
		// insert the first element in 
		// the list make 'root' point to
		// it and return since there is
		// nothing else to do.
		if(root == null) {
			root = n;
			return;
		}
		
		// if the 'root' is not null then
		// there are some elements in the
		// list so we need to traverse to
		// the end of the list. End
		// of a list is defined as the node
		// whose 'next' pointer is NULL.
		// If we change 'root' node we will
		// loose track of the start of the
		// list since it is the only pointer
		// pointing to the start of the list.
		// So we use a 'temp' pointer to
		// find the last node in the list.
		Node temp = root;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		// We have reached the last node so set
		// the next element of the last node to
		// be the node we want to insert in the list.
		temp.setNext(n);
	}
}
