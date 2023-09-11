//Implement Single level Inheritance in Typescript

export class Employee {
    constructor(public name: string) {}

    salary() {
        console.log(`Employee Name: ${this.name} has 20,000 salary`);
    }
}

