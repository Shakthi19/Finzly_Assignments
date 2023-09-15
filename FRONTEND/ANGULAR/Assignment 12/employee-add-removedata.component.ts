import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-add-removedata',
  templateUrl: './employee-add-removedata.component.html',
  styleUrls: ['./employee-add-removedata.component.css']
})
export class EmployeeAddRemovedataComponent implements OnInit {
  newEmployee: any = {};
  employees: any[] = [];

  addEmployee() {
    if (this.newEmployee.id && this.newEmployee.name && this.newEmployee.salary) {
      this.employees.push({ ...this.newEmployee });
      this.newEmployee = {};
    }
  }

  removeEmployee(index: number) {
    this.employees.splice(index, 1);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
