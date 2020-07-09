package pack;

public class TestBinary {

	static int arrInput[] = {0,1,1,2,2,2,3,3,4,4,4,4,4,5,5,6,7,8,9,10,11};
	static int arrInputRotate[] = {5,6,7,8,9,1,2,3,4};
	public static void main(String[] args) {
		System.out.println(binarySearch(arrInput, 0, arrInput.length-1 ,9));
		System.out.println(binaryDuplicates(arrInput, 0, arrInput.length-1 ,5));
		System.out.println(binaryRotationIndex(arrInputRotate, 0, arrInputRotate.length-1));
	}
	private static int binaryDuplicates(int[] arr, int start, int end, int key) 
	{
		
		int startIndex= getStartIndex(arr, start, end, key);
		System.out.println(startIndex);
		int endIndex=getLastIndex(arr, start, end, key);
		System.out.println(endIndex);
		return (endIndex-startIndex)+1;
	}
	
	private static int getStartIndex(int[] arr, int start, int end, int key) {
		if(end>=start)
		{
			int mid=(end+start)/2;
			if(arr[mid]==key &&arr[mid-1]!=key)
			{
				return mid;
			}
			if(arr[mid]<key)
			{
				return getStartIndex(arr, mid+1, end, key);
			}
			else
			{
				return getStartIndex(arr, start, mid, key);
			}
		}
		return -1;
	}
	private static int getLastIndex(int[] arr, int start, int end, int key) 
	{
		if(end>=start)
		{
			int mid=(end+start)/2;
			if(arr[mid]==key &&arr[mid+1]!=key)
			{
				return mid;
			}
			if(arr[mid]>key)
			{
				return getLastIndex(arr, start, mid, key);
			}
			else
			{
				return getLastIndex(arr, mid+1,end, key);
			}
		}
		return -1;
		
	}
	private static int binaryRotationIndex(int[] arr, int start, int end) {
		if(end>=start)
		{
			int mid= (start+end)/2;
			if(arr[mid]>arr[mid+1])
			{
				return mid;
			}
			if(arr[start]>arr[mid])
			{
				return binaryRotationIndex(arr, start, mid);
			}
			else
			{
				return binaryRotationIndex(arr, mid+1, end);
			}
		}
		return -1;
	}
	private static int binarySearch(int[] arr, int start, int end, int key) {
		if(end>=start)
		{
			int mid= (start+end)/2;
			if (arr[mid]==key)
			{
				return mid;
			}
			if(key<arr[mid])
			{
				return binarySearch(arr, start, mid,key);
			}
			else
			{
				return binarySearch(arr, mid+1, end,key);
			}
		}
		return -1;
	}
}
