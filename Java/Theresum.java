public class Theresum
{

 

    public static void thereSum(int[] arr,int x)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		for( int j=i+1 ;j<arr.length;j++)
    		{
    			for(int k=j+1;k<arr.length;k++)
    			{
    				if(arr[i] + arr[j] +arr[k]==  x)

    				{
    					System.out.println(arr[i] +"" +arr[j]+""+arr[k]);
    				}
    			}
    		}
    	}
    }




	public static void main(String args[])
	{
		int[] arr = {1,4,45,6,10,8};
		 int x = 13;

		thereSum(arr,x);

	}
}