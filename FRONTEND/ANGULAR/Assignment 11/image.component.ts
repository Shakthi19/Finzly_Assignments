import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-image',
  templateUrl: './image.component.html',
  styleUrls: ['./image.component.css']
})
export class ImageComponent implements OnInit {
  opacity = 2.0; 

  onMouseOver() {
    this.opacity = 0.6; 
  }

  onMouseOut() {
    this.opacity = 3.0; }
  constructor() { }

  ngOnInit(): void {
  }

}
