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
exports.Project = void 0;
var Assignment5subclass_1 = require("./Assignment5subclass");
var Project = /** @class */ (function (_super) {
    __extends(Project, _super);
    function Project(name) {
        var _this = _super.call(this, name) || this;
        _this.name = name;
        return _this;
    }
    Project.prototype.display = function () {
        console.log(this.name + " has assigned this project as Developer employee.");
    };
    return Project;
}(Assignment5subclass_1.Developer));
exports.Project = Project;
