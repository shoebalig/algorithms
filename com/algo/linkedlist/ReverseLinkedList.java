package com.algo.linkedlist;

import com.algo.linkedlist.LinkAgain.Node;

public class ReverseLinkedList {
	// Java program to detect and remove loop in linked list
	 
	    static Node head;
	    static Node rev;
		private static Node current;
	 
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	 

	 
	    // Driver program to test above functions
	    public static void main(String[] args) {
	    	head = new Node(1);
	    	head.next= new Node(2);
	    	head.next.next= new Node(3);
	    	head.next.next.next= new Node(4);
	    	head.next.next.next.next= new Node(5);
	    	Node temp = head;
	    	printList(temp);
	    	current.next=null;
	    	printList1(rev);
	    	
	    }



		private static void printList1(Node temp) {
			if(temp !=null)
			{
				System.out.println(temp.data);
				Node temp1 = temp.next;
				printList1(temp1);
			}
			if(temp ==null)
				return;
			
		}



		private static void printList(Node temp) {
			
			if(temp !=null)
			{
				Node temp1 = temp.next;
				printList(temp1);
				if(rev==null)
				{
					rev= temp;
					current = rev;
				}
				else
				{
					current.next= temp;
					current = current.next;
				}
			}
		}
}
