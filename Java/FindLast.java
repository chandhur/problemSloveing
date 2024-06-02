public class FindLast
{



public void value(int a , int b)
{

    double total =  Math.pow(a,b);
    int value1=(int)total % 10;
    System.out.println(value1);
         

}

public static void main(String args[])
{

      FindLast name = new FindLast();

      int a=3;
      int b=10;
      name.value(a, b);

}



}