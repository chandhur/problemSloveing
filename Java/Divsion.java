import java.util.Scanner;

public class Divsion
{

 public void computer(int value)
{
     for(int i=1;i<=value;i++)
     {
       if(value % i == 0)
        {
          System.out.println(i);
         }
      }
}

public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    Divsion value1 = new Divsion();
     int value = input.nextInt();
     value1.computer(value);

}



}