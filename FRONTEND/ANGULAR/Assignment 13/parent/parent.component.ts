import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  receivedData: any = {};

  receiveDataFromChild(data: any) {
    this.receivedData = data;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
