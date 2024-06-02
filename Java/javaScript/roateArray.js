function name(va,start,end)
{
   while(start < end)
  {
    let temp=va[start]
    va[start]=va[end]
    va[end]=temp;
     start++
     end--
  }
  return va;
  
 }
 function roate(va)
 {
        var value=3;
        name(va,0,value-1);
        name(va,value,va.length-1)
        name(va,0,va.length-1)
        
        return va;
    
   
   
}
let va=roate([1,2,3,4,5,6,7,8,9])
console.log(va);