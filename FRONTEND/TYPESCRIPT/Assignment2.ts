//Dynamic Array
let arr:number[]=[];

//push
arr.push(10,20,30);
console.log(arr);

//pop
arr.pop();
console.log(arr);

//Traverse
let i =0;
arr.forEach(element => {
    arr[i]=element+i;
    i++;

});
console.log(arr);


//Create String Array and Traverse the Array
let d:string[]=['Shakthi','Sri','Chennai'];

for(let i=0;i<d.length;i++){
    console.log("value of a is "+d[i]+" index is "+i)
}
