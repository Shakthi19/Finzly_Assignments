"use strict";
//Implement Single level Inheritance in Typescript
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.name = name;
    }
    Employee.prototype.salary = function () {
        console.log("Employee Name: " + this.name + " has 20,000 salary");
    };
    return Employee;
}());
exports.Employee = Employee;
