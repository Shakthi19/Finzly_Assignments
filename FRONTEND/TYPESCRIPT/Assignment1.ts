//Anonymous Function

//without ret&param
let temp1=function (){
     console.log("Anonymous Function is called ")
 }
 temp1();

//with ret&param
 let temp2=function (a:number,b:number):number{
     return (a+b);
 }
 let res1=temp2(10,5);
 console.log("Result is "+res1);

//without param with ret
 let temp3=function(){
     return (10+2)
 }
 let k=temp3()
 console.log("Result is "+k)


//with param without ret
 let temp4=function(a:number,b:number){
     console.log("Result is "+(a+b))
 }
 let k=temp4(1,2)

//Fat arrow function/ Arrow function 
//without param without ret
    let temp5= ()=>{
         console.log("Fat arrow is used")
     }

 temp5();

//without param with ret
    let temp6= ():string=>{
         return("Fat arrow is used")
     }

     console.log(temp6());

//with param without ret
 let temp7= (a:number,b:number)=>{
     console.log(a+b)
 }
 temp7(1,2)

//both with param and ret
   let temp8=  (a:number,b:number):number=>{
         return (a+b);
     }
    

       let res3=  temp8(10,20);
       console.log("value of res3 is "+res3)
