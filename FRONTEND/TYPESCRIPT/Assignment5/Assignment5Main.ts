import { Employee } from './Assignment5baseclass';
import {Project} from './Assignment5derivedclass';
import { Developer } from './Assignment5subclass';
let job=new Employee("Shakthi");
job.display();
let emp=new Developer("Shakthi");
emp.display();

let dev=new Project("Shakthi");
dev.display();
