

public class FindIndex
{

public int[] value(int[]  arr, int stop)
{
    for(int i=1;i<arr.length;i++)
     {
         for (int j=0;j<arr.length-i;j++)
               { 
                    if(arr[j]>arr[j+1])
                       {
                             int temp =arr[j];
                              arr[j]=arr[j+1];
                             arr[j+1]=temp;
                       }
               
              }
    }
     
   return arr;
}

public static void main(String args[])
{
 
   FindIndex find = new FindIndex();
   int[]  arr={1,2,3,4};
    int stop=3;
    find.value(arr,stop);
    System.out.println("this the index"+arr[arr.length-3]);
  
   


}
}