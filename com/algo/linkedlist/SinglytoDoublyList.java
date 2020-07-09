package com.algo.linkedlist;

public class SinglytoDoublyList {
	static Node head;
	public static void main(String[] args) {
		
		head=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(13);
		Node n4=new Node(4);
		Node n5=new Node(52);
		Node n6=new Node(6);
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		traverseMe(head);
		convertToDoubly();
	}


	private static void traverseMe(Node t) {
		
		Node current=t;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
private static void traverseDoublyMe(Node t) {
		
		Node current=t;
		while(current!=null)
		{
			System.out.println("current.data :- " +current.data);
			/*if(current.next!=null)
			System.out.println("current.next.data :- " + current.next.data);
			if(current.prev!=null)
			System.out.println("current.prev.data :- " +current.prev.data);*/
			current=current.prev;
		}
	}

	//1,2,13,4,52,6
	private static void convertToDoubly()
	{
		Node doubly = null,current=head;
		Node preve=null;
		doubly=current;
		while(current!=null)
		{
			doubly.prev=preve;
			doubly.next=current.next;
			preve = current;
			current=current.next;
			if(current!=null)
			doubly=doubly.next;
		}
		head=doubly;
		traverseDoublyMe(doubly);
	}

	static class Node
{
	private int data;
	private  Node next;
	private  Node prev;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
}