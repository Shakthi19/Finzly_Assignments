import {Employee} from './Assignment4'
export class Developer extends Employee {
    constructor(name: string) {
        super(name); 
        this.name=name
    }

    salary(): void {
        console.log(`Developer Name: ${this.name} has 50,000 salary`);
    }

}

