import java.util.Scanner;

public class Reverse 
{



public void value1(int sum)
{

	 int ji=sum;
	 int store=0;


     while(sum>0)
	  {

          int start1 = sum % 10;
          store =(store*10)+start1;
          sum=sum/10;
		  
		 // in javascript useing mathFloor

	  }
	  
	  String prime = store == ji ? "PrimeNumber" : "NotPrime";
	  System.out.println(prime);

}

	public static void main(String args[])
	{

            Scanner input = new Scanner(System.in);
            Reverse num= new Reverse();
            System.out.println("Enter the number");
            int sum= input.nextInt();
             num.value1(sum);


	}
}