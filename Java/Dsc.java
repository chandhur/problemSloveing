public  class Dsc
{


public int[] ma(int[] arr)
{
   
   for (int i=1;i<arr.length;i++)
   {
   	for(int j=0;j<arr.length-i;j++)
   	{
   		if(arr[j+1]> arr[j])
   		{
   			int temp=arr[j];
   			  arr[j]=arr[j+1];
   			  arr[j+1]=temp;
   		}
   	}
   }
   
   return arr;
}
	public static void main(String args[])
	{
		Dsc da= new Dsc();

        int[] arr= {0, 2, 1, 2, 0};

         da.ma(arr);

		for(int x:arr)
		{
			System.out.println(x);
		}

	}
}