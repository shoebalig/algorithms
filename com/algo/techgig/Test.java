package pack;

import org.omg.CORBA.FixedHolder;

// sorted array, duplicates
// count occurences of a number in a sorted array
//e.g {0,1,1,2,2,2,3,3,4,4,4,5,5,6}, number=4
//result:- 3
//
public class Test {
	
	 //int arr[] = new int{0,1,1,2,2,2,
	//3,3,4,4,  4,5,5,6};
	static int arr[] = {0,1,1,2,2,2,3,3,4,4,4,5,5,6};
	
	public static void main(String[] args) {
		System.out.println(returnCount(arr, 4, 0, arr.length-1 ));
	}
	static int returnCount(int arr[], int key, int start, int end)
	{
		
		int first = binarySearchFirst(start, end, arr, key);
		int last = binarySearchLast(start, end, arr, key);
		System.out.println(first);
		System.out.println(last);
		return (last-first)+1;
		//return first ;
	}

	
	//e.g {0,1,1,2,2,2,3,3,4,4,4,5,5,6}, number=4
	private static int binarySearchFirst(int start, int end, int[] arr, int key) 
	{
		if(start<=end)
		{
			int mid = (end+start)/2;
			if((key!=arr[mid-1])&&arr[mid]==key )
			{
				return mid ; 
			}
			else if(arr[mid]<key)
			{
				return binarySearchFirst((mid+1), end, arr,key);
			}
			else
			{
				return binarySearchFirst(start, (mid-1), arr,key);
			}
		}
		return -1;
	}
	private static int binarySearchLast(int start, int end, int[] arr, int key) 
	{
		if(start<=end)
		{
			int mid = (end+start)/2;
			if((key!=arr[mid+1])&&arr[mid]==key )
			{
				return mid ; 
			}
			else if(arr[mid]<key)
			{
				return binarySearchLast((mid+1), end, arr,key);
			}
			else
			{
				return binarySearchLast(start, (mid-1), arr,key);
			}
		}
		return -1;
	}}
