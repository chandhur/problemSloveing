import java.util.Scanner;

public class Gcd
{
       public void Output(int sum,int num)
   {
       int store=0;

       if( sum  > num)
       {
       	  store=sum;
       }
       else
       {
       	 store=num;
       }

      for(int i=store;i>=1;i--)
      {
      	if( sum % i == 0  && num % i == 0 )
        {
              System.out.println(i);
      	}
      }

   }

   public static void main(String args[])
 {
    Scanner input = new Scanner(System.in);

    Gcd value = new Gcd();

    int sum = input.nextInt();

    int num = input.nextInt();

    value.Output(sum,num);
 }  




}