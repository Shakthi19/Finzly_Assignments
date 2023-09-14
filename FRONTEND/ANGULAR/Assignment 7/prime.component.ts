import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-prime',
  templateUrl: './prime.component.html',
  styleUrls: ['./prime.component.css']
})
export class PrimeComponent implements OnInit {
  numberToCheck: number = 0;
  result: string = '';
  constructor() { }

  checkPrime() {
    if (this.numberToCheck <= 1) {
      this.result = 'not a prime number';
      return;
    }

    for (let i = 2; i <= Math.sqrt(this.numberToCheck); i++) {
      if (this.numberToCheck % i === 0) {
        this.result = 'not a prime number';
        return;
      }
    }

    this.result = 'a prime number';
  }
  
  ngOnInit(): void {
  }

}
