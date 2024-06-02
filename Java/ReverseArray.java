public class ReverseArray
{
  
  public static void child(int[] a)
  {
  	
      int start=0;

      int value=a.length-1;


      while(start < value)
      {
         int temp=a[start];

         a[start]=a[value];
               
          a[value]=temp;

          start++;
          value--;

      }


  }


  public static void main(String args[])
	
	{
		int[]  a={2,4,6,8,10};
      
      child(a);
       
       for(int i=0;i<a.length;i++)
       {
       	System.out.println(a[i]);
       }
    }
	
}