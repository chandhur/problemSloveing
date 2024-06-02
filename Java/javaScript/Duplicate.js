// duplicate 


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
	
	let store=0;
	
	for( var k=1;k<duplicate.length;k++)
	{
	   if( duplicate[k] !== duplicate[store])
	   {
		   
		   store++
		   duplicate[store]=duplicate[k]

	   }		   

		
	}
	
	return [store+1,duplicate];
	
	
	
}
let va=[1, 2, 2, 4,3,3,5,7,1];
let value=dupliacate(va);
for(var l=0;l<value[0];l++)
{
	console.log(value[1][l])
	
}