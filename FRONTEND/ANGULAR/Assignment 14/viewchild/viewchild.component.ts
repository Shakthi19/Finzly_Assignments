import { Component,ElementRef,ViewChild, OnInit } from '@angular/core';

@Component({
  selector: 'app-viewchild',
  templateUrl: './viewchild.component.html',
  styleUrls: ['./viewchild.component.css']
})
export class ViewchildComponent implements OnInit {
  @ViewChild('container') container!: ElementRef;
  @ViewChild('centeredButton') centeredButton!: ElementRef;
  constructor() { }

  ngOnInit(): void {
  }

}
