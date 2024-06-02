import java.util.Scanner;

public class Amstrong
{


    public void Problem(int num)
    {

         int a=num;
         int sum=0;

          while( num >0)
          {

          	int store = num % 10 ;
            sum = sum+ store * store * store;   
             num= num/10;
           }

          
          String check =   a == sum ? "AmstrongNumber" : "NoAmstrongNumber";
          System.out.println(check);


    }





	public static void main(String args[])
	{

           Scanner input = new Scanner(System.in);
           Amstrong value = new Amstrong();
           int num= input.nextInt();
           value.Problem(num);

	}
}