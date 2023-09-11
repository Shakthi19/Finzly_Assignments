import {Employee} from './Assignment5baseclass'
export class Developer extends Employee {
    constructor(name: string) {
        super(name); 
        this.name=name
    }

    display() {
        console.log(`${this.name} has Developer role.`);
    }

}

