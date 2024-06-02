public class ThereSumDsa
{

    static void Sort(int[] arr)
    {

         for( int i=1;i<arr.length;i++)
         {
            for(int j=0;j<arr.length-i;j++)
            {
                if( arr[j] > arr[j+1])
                {

                    int temp=arr[j];

                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

         }


    }
    public static void main(String args[])
    {
        int[]  arr={-1,0,1,2,-1,-4};

        Sort(arr);

        for( int x :arr)
        {
            System.out.println(x);
        }
    }
}