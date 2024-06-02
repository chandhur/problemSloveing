// bubble sort array
function array(va)
{
	
 for(let i=1;i<va.length;i++)
 {
    for( let j=0;j<va.length-i;j++)
	{
		if(va[j] > va[j+1])
		{
			var temp=va[j];
			va[j]=va[j+1]
			va[j+1]=temp;
			
	    }
      }
 }
 
 return va;
	
}
let va=[9,4,3,6,51,11,67];
let value=array(va);
console.log(value);
