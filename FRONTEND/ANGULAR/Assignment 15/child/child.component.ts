import { Input,Component,EventEmitter, OnInit,Output } from '@angular/core';

@Component({
  selector: 'app-child',
  template: `
  <div [style.background-color]="rating < 6 ? 'red' : 'green'">
    <h3>Child Component</h3>
    <p>Rating: {{ rating }}</p>
  </div>
`,
  // template: `
  //   <button (click)="sendDataToParent()">Send Data</button>
  // `,
})
export class ChildComponent {
  @Input() rating: number = 0;
  // @Output() dataToParent = new EventEmitter<any>();

  // sendDataToParent() {
  //   const jsonData = { name: 'Shakthi', role: 'Student', city: 'Chennai' };
  //   this.dataToParent.emit(jsonData);
  // }
}