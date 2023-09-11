export class Employee {
    constructor(public name: string) {}

    display() {
        console.log(`Employee Name: ${this.name} is working.`);
    }
}