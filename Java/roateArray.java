public class roateArray
{

static void revese(int[] arr, int start,int end)
{
	
	

	while( start < end)
	{
		int temp =arr[start];

		arr[start]=arr[end];

		arr[end]=temp;

		start ++;
		end--;
    }


  

}

 static void roate(int[] arr, int h)
   {

     
   	  revese(arr,0,h-1);
      revese(arr,h,arr.length-1);
      revese(arr,0,arr.length-1);

   }



	public static void main(String args[])
	{

         int[] arr = {1,2,3,4,5};

         int h=3;
           
         roate(arr,h);

        


         for(int x:arr)
         {
         	System.out.println(x);
         }
	}
}