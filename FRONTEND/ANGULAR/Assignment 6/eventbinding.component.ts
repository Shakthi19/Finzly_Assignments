import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrls: ['./eventbinding.component.css']
})
export class EventbindingComponent implements OnInit {
  data="Hi, Shakthi!"
  constructor() { }

  ngOnInit(): void {
  }


  sendData(newData:string){
    this.data=newData;
  }
}
