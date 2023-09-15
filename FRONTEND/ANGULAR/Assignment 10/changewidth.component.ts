import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-changewidth',
  templateUrl: './changewidth.component.html',
  styleUrls: ['./changewidth.component.css']
})
export class ChangewidthComponent implements OnInit {
  user = {
    username: '',
    password: ''
  };

  inputWidth = '50px';

  onSubmit() {
    console.log('Login submitted:', this.user);
  }


  
  constructor() { }

  ngOnInit(): void {
  }

}
