import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router) { }

  onClick() {
    this.router.navigate(['user']);
  }

  verifyLoginInfo() {
    // submit username/pass from form and get whether it's in db in response
  }

  ngOnInit() {
  }

}
