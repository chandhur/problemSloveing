import java.util.Scanner;

public class PowerValue
{ 


public void power(int start, int end)
{

    double value = Math.pow(start,end);
    System.out.println((int)value);
}


public static  void  main(String args[])
{
   Scanner input = new Scanner(System.in);

   PowerValue num= new PowerValue();
    int start= input.nextInt();
    int end=input.nextInt();
    num.power(start,end);



 }
}