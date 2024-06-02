import java.util.Scanner ;

public  class student{


static int mySelf(int value1){


   int store = 0 ;

    while(value1 != 0){

        int reminder = value1 % 10;
        store =  store * 10 + reminder;
        value1 = value1/10;
    }
    return store;
}


public static void main(String args[])
{
  Scanner value = new Scanner(System.in);
  String value1=value.nextLine();
   System.out.println(mySelf(Integer.parseInt(value1)));
 
}

}