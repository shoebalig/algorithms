package com.algo.dynamic;

import java.util.HashMap;

public class LRUCache {
	static int LRU_SIZE=4;
	static HashMap<String, Node> lruCache = new HashMap<>(LRU_SIZE);
	static Node head;
	static Node tail;

	public static void main(String[] args) 
	{
		set("1", "23");
		set("2", "24");
		set("3", "25");
		set("4", "26");
		set("5", "27");
		set("3", "30");
		set("2", "31");
		removeNode("3", "33");
		printList();
		System.out.println();
		Node node = getNode("5");
		printList();
		getNode("4");
		System.out.println();
		printList();
		set("8","40");
		System.out.println();
		printList();
	}
	private static Node getNode(String key) 
	{
		Node tmp = lruCache.get(key);
		if(tmp==null)
			return null;
		resetLink(tmp);
		resetHead(tmp);
		return tmp;
	}
	private static void resetHead(Node tmp) {
		tmp.next=head;
		head.pre=tmp;
		head=tmp;
	}
	private static void printList() 
	{
		Node tmp = head;
		while(tmp!=null)
		{
			System.out.print("->"+tmp.key);
			tmp= tmp.next;
		}
	}
	private static void set(String key, String value) 
	{
		if(lruCache.containsKey(key))
		{
			if(isCacheFull())
			{
				removeNode(key, value);
				addNode(key, value);
			}
		}
		else
		{
			if(!isCacheFull())
			{
				Node tmp = new Node(key,value);
				lruCache.put(key, tmp);
				if(head==null)
				{
					head = tmp;
				}
				if(tail==null)
				{
					tail = tmp;
				}
				else
				{
						resetHead(tmp);
				}
			}
			else
			{
				addNewNodeIfCacheFull(key, value); 
			}
			}
		}
	private static void removeNode(String key, String value) {
		Node deleteNode = lruCache.get(key);
		lruCache.remove(key);
		resetLink(deleteNode);
	}
	private static void resetLink(Node deleteNode) {
		if(deleteNode.next==null)
		{
			deleteNode.pre.next=null;
		}
		if(deleteNode.pre==null)
		{
			head =deleteNode.next;
		}
		if(deleteNode.pre!=null && deleteNode.next!=null)
		{
			deleteNode.pre.next =deleteNode.next;
			deleteNode.next.pre=deleteNode.pre;
		}
	}
	private static void addNode(String key, String value) {
		Node tmp = new Node(key,value);
		lruCache.put(key, tmp);
		resetHead(tmp);
	}
	private static boolean isCacheFull() {
		return lruCache.size() >= LRU_SIZE;
	}
	private static void addNewNodeIfCacheFull(String key, String value) 
	{
		lruCache.remove(tail.key);
		Node tmp = tail.pre;
		tmp.next=null;
		tail = tail.pre;
		set(key, value);
	}
	
	static class Node
	{
		Node pre;
		Node next;
		String key;
		String value;
		Node(String key, String value)
		{
			this.key =  key;
			this.value= value;
		}
	}
}
