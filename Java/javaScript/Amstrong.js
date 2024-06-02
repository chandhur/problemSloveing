function number(sum)
{
	let a=sum;
     
	 // the  store the number 
	 let store=0;
  while(a > 0)
  {
	  let temp=a%10;
	   store = store + temp* temp* temp
	   a=parseInt(a/10);
	   
  }
  
    let check= sum == store ? "AmstrongNumber" :"Not AmstrongNumber";
	
	return check;
	
	
}
let value=number(154);
console.log(value);