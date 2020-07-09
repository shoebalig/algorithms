package com.algo.dynamic;

import java.util.Stack;

public class StackMax {

	static Stack<Integer> stack =  new Stack<>();
	int maxValue=0;
	public void push(int item)
	{
		if (stack.isEmpty()) 
        { 
            maxValue = item; 
            stack.push(item); 
        } 
		else if (item > maxValue) 
        { 
        	stack.push(2*item - maxValue); 
            maxValue = item; 
        } 
  
        else
            stack.push(item); 
  
	}
	public Integer pop()
	{
		if (stack.isEmpty()) 
            System.out.println("Stack is empty, please add with some Elements"); 
  
        Integer popedItem = stack.pop(); 

        if (popedItem > maxValue) 
        {
            int temp =maxValue;
        	maxValue = 2*maxValue -popedItem; 
            return temp;
        }
        else
        	return popedItem;
	}
	public Integer peek()
	{
		return stack.peek();
	}
	public Integer getMax()
	{
		return maxValue;
	}
	public static void main(String[] args)
	{
		StackMax stackOperations =  new StackMax();
		stackOperations.push(13);
		stackOperations.push(5);
		stackOperations.push(8);
		stackOperations.push(11);
		stackOperations.push(15);
		stackOperations.push(20);
		stackOperations.push(18);
		stackOperations.push(1);
		System.out.println(stack);
		/*System.out.println(stackOperations.pop());
		stackOperations.push(1);
		stackOperations.push(10);
		System.out.println(stackOperations.pop());
		stackOperations.push(2);
		stackOperations.push(-14);
		stackOperations.push(21);*/
		System.out.println(stackOperations.pop());
		System.out.println(stackOperations.pop());
		System.out.println(stackOperations.pop());
		System.out.println(stackOperations.pop());
		System.out.println(stackOperations.pop());
		System.out.println(stackOperations.pop());
		
		System.out.println(stackOperations.getMax());
	}

}
