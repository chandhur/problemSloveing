public class FindRet
{

   

   public void find(int[] b)
   {
         for(int i=0;i<b.length;i++)
         {
         	for(int j=i+1;j<b.length;j++)
         	{
         		if(b[i] == b[j])
         		{
         			System.out.println(b[i]);
         		}
         	}
         }
   }
	public static void main (String args[])
	{
         FindRet va = new FindRet();

         int[] b={1,3,4,4,5,2,5,6,6,7};

         va.find(b);
	}
}