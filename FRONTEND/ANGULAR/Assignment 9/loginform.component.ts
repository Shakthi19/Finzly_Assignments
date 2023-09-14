import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.css']
})
export class LoginformComponent implements OnInit {
  user = {
    username: '',
    password: ''
  };
  loginFailed = false;
  onSubmit() {
    if (this.user.username === 'Shakthi' && this.user.password === 'Shakthisri') {
      this.loginFailed = false;
      console.log('Login successful');
    } else {
      this.loginFailed = true;
      console.log('Login failed');
    }
  }
  constructor() { }

  ngOnInit(): void {
  }

}
