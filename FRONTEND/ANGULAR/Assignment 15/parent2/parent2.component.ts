import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent2',
  templateUrl: './parent2.component.html',
  styleUrls: ['./parent2.component.css']
})
export class Parent2Component implements OnInit {
  rating: number = 0;

  updateRating(value: number) {
    this.rating = value;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
