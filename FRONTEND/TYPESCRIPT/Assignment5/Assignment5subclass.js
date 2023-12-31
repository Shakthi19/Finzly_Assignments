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
var Assignment5baseclass_1 = require("./Assignment5baseclass");
var Developer = /** @class */ (function (_super) {
    __extends(Developer, _super);
    function Developer(name) {
        var _this = _super.call(this, name) || this;
        _this.name = name;
        return _this;
    }
    Developer.prototype.display = function () {
        console.log(this.name + " has Developer role.");
    };
    return Developer;
}(Assignment5baseclass_1.Employee));
exports.Developer = Developer;
