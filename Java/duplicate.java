public class duplicate
{
static int  val(int[] arr)
{

   int store=0;

   for( int i=1;i<arr.length;i++)
   {
   	if(arr[i] !=  arr[store])
   	
   		store++;
   		arr[store]=arr[i];
   	}
   }

   return store+1;
}

public static void main(String args[])
{

 int[] arr = {1, 2, 2, 4};
  int s=val(arr);


 
 System.out.println("--------------------------------------");
  for(int j=0;j<s;j++)
  {
  	System.out.println(arr[j]);
  }
}
}



const n = 5;
let str = '';

for (let i = 1; i <= n; i++) {
    
    for (let j = 1; j <= i; j++) {
        str += '* ';
    }
    str += '\n';
}
console.log(str);