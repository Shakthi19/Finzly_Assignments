//Display class data using advanced features of Typescript

demo1.ts
export class Shakthi{
    public id:number;
    private name:string;
    protected  place:string;

    constructor(id:number,n:string,p:string){
      
       this.id=id;
       this.name=n;
       this.place=p;
    }
    public display(){
        console.log(`
            Id         ::${this.id}
            Name       ::${this.name}
            Place      ::${this.place}
        `)
    }

}
export function multiply(a:number,b:number):number{
    return (a*b);
}

export const cgpa=9;


demo2.ts
import {Shakthi,multiply,cgpa} from './demo1';

let obj=new Shakthi(132,'Shakthi Sri','Chennai');
obj.display();

console.log(`
    Value is ${multiply(1,2)}
`);

console.log('Grade is '+cgpa)
