"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Developer = void 0;
var Assignment4_1 = require("./Assignment4");
var Developer = /** @class */ (function (_super) {
    __extends(Developer, _super);
    function Developer(name) {
        var _this = _super.call(this, name) || this;
        _this.name = name;
        return _this;
    }
    Developer.prototype.salary = function () {
        console.log("Developer Name: " + this.name + " has 50,000 salary");
    };
    return Developer;
}(Assignment4_1.Employee));
exports.Developer = Developer;
