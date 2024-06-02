
import java.util.Arrays;
public class Sort
{


public void value()
{

	 int a[] = {3, 2, 1, 56, 10000, 167};

	 Arrays.sort(a);

	 for(int x:a)
	 {
	 	System.out.println(x);
	 }


}



public static void main(String args[])
{
	Sort input = new Sort();

	input.value();
}

}