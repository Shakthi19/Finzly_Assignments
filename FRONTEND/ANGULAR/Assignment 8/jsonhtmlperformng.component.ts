import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-jsonhtmlperformng',
  templateUrl: './jsonhtmlperformng.component.html',
  styleUrls: ['./jsonhtmlperformng.component.css']
})
export class JsonhtmlperformngComponent implements OnInit {
  isActive: boolean = true;
  isHighlighted: boolean = false;
  isDisabled: boolean = false;

  toggleStatus() {
    this.isActive = !this.isActive;
    this.isHighlighted = !this.isHighlighted;
    this.isDisabled = !this.isDisabled;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
