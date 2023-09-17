import { Component,EventEmitter, OnInit,Output } from '@angular/core';

@Component({
  selector: 'app-child',
  template: `
    <button (click)="sendDataToParent()">Send Data</button>
  `,
})
export class ChildComponent {
  @Output() dataToParent = new EventEmitter<any>();

  sendDataToParent() {
    const jsonData = { name: 'Shakthi', role: 'Student', city: 'Chennai' };
    this.dataToParent.emit(jsonData);
  }
}