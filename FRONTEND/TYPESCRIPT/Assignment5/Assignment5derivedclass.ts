import {Developer} from './Assignment5subclass'
export class Project extends Developer {
    constructor(name: string) {
        super(name); 
        this.name=name
    }

    display(): void {
        console.log(`${this.name} has assigned this project as Developer employee.`);
    }

}

