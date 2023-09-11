"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.name = name;
    }
    Employee.prototype.display = function () {
        console.log("Employee Name: " + this.name + " is working.");
    };
    return Employee;
}());
exports.Employee = Employee;
