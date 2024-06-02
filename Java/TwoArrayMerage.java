public class TwoArrayMerage{
	
	
	static void array(int[] arr1,int[] arr2)
	{
		int total=arr1 + arr2 ;
		int[] c = new int[total]; 
		System.out.println(c);
	}
	
	
	public static void main(String args[])
	{
		int[] arr1= {2, 3, 6, 7, 9};
        int[]arr2 = {1, 4, 8, 10};
		
		array(arr1, arr2);
		
	}
	
	
}