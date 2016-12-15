package edu.csus.cs206.linkedlist;

public class CreatePrintList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		// Insert 1, 10, 5, 4, 2 into the list
		l.addNode(1);
		l.addNode(10);
		l.addNode(5);
		l.addNode(4);
		l.addNode(2);
		
		// Print the list. To print a  list we 
		// start from the 'root' and go on until
		// we reach the end of the list.
		
		System.out.print("List Content: ");		

		Node temp = l.getRoot();
		while(temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
 	}
}
