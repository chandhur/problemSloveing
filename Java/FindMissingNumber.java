public class FindMissingNumber
{

 public int[] missing(int[] a)
{
        for( int i=1;i<=a.length;i++)
         {
            for(int j=0;j<a.length-i;j++)
         {
              if(a[j]>a[j+1])
             {
                 int temp = a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
             }
         }
    }
    
         return a;        
       

}

public static void main(String args[])
{
     FindMissingNumber value= new FindMissingNumber();

     int[]  a= {6,1,2,8,3,4,7,10,5};
     
      value.missing(a);

   for(int k=0;k<=a.length;k++)
        {
             if( a[k]  != ++k)
                  {
                    System.out.println( k) ;
                     break;

                  }
             
          }

}






}