import java.util.Arrays;

public class DsaSort
{
      public int[] Sort(int[] a)
     {
         for(int i=1;i<a.length;i++)
        {
        	for( int j=0;j<a.length-i;j++)
        	{
                if(a[j] > a[j+1])
        	{
        	  int temp = a[j];
        			
        	   a[j] = a[j+1];
        			
        	   a[j+1] = temp;
        			
        	      }
        	}
        }
        
        return a;
     }

public static void main(String args[])
{ 
DsaSort input = new DsaSort();
       
       int[] a={1,70,56,1000,23,1008};

        input.Sort(a);

        for( int x:a)
        {
            System.out.println(x);
        }
        
        
        
}




}