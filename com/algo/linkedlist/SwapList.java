package com.algo.linkedlist;

import com.algo.linkedlist.ReverseMe.Node;
//123456
//162534
public class SwapList {
	static Node head;
	static Node newHead;
	static Node tail;
	static Node reversehead;
	static Node revehead;
	static Node rev;
	private static Node current;
	private static Node prev;
	static Node fast = head;
	static Node slow = head;
	static Node last=null;
	private static Node newHead1;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	private static void printList(Node temp) {
		if(temp!=null)
		{
			System.out.println(temp.data);
			printList(temp.next);
		}
		
	}
	public static void main(String[] args) {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
//		tail=head.next.next.next.next.next.next;
//		tail.next =head.next.next.next.next.next;
//		tail.next.next =head.next.next.next.next;
//		tail.next.next.next =head.next.next.next;
//		tail.next.next.next.next =head.next.next;
//		tail.next.next.next.next.next =head.next;
//		tail.next.next.next.next.next.next =head;
//		tail.next.next.next.next.next.next.next =null;
		fast = head;
		slow = head;
		Node temp = head;
		swapMe(temp);
		//System.out.println(getLastNode(head).data);
		printList(newHead1);
		
	}
	//1234567
	//1726354
	
	private static void swapMe(Node temp) {
		if(fast!=null)
		{
			if(newHead==null)
			{
				newHead=temp;
				newHead1=temp;
			}
			Node test = getLastNode(temp);
			if(test!=null)
			{
				Node hold= temp.next;
				newHead.next=test;
				newHead.next.next=hold;
				test.next=hold;
				if(newHead.next!=null && newHead.next.next!=null)
					newHead = newHead.next.next;
			}
			slow= fast;
			fast=fast.next.next;
			swapMe(fast);
		}
		else
		{
			newHead.next=slow;
			slow.next=null;
		}
	}
	private static Node getLastNode(Node temp)
	{
		if(temp!=null && temp.next!=null)
		{
			prev=temp.next;
			last = temp.next.next;
			getLastNode(temp.next.next);
		}
		prev.next=null;
		return last;
	}
}
