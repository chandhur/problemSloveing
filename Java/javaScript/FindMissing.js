
function sort(va)
{
	
	for( var i=1;i<va.length;i++)
	{
		for(var j=0;j<va.length-i;j++)
		{
		if( va[j] > va[j+1])
		{
			var temp=va[j];
			va[j]=va[j+1];
			va[j+1]=temp;
		}
			
		}
	}
	
	return  va;
}
function dupliacate(va)
{
	
    let duplicate= sort(va);
    
    for( var m=0; m<duplicate.length;m++)
    {
      if(  duplicate[m] !== ++m)
      {

        return m;
      }
    }
    
	
	
}
let va=[6,1,2,8,3,4,7,10,5];
let value=dupliacate(va);
console.log(value);

