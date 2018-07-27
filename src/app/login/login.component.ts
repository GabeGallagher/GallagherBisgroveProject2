import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { Router } from '@angular/router';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
=======
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

<<<<<<< HEAD
  constructor(private router: Router) { }

  verifyLoginInfo() {
    // submit username/pass from form and get whether it's in db in response
  }

  onLogin() {
    this.router.navigate(['user']);
  }

  onSignUp() {
    this.router.navigate(['registration']);
  }
=======
  constructor() { }
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5

  ngOnInit() {
  }

}
