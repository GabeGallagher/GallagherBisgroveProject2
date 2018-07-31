import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DataService } from '../data.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  users$: Object;

  constructor(private router: Router, private data: DataService) { }

  verifyLoginInfo() {
    // submit username/pass from form and get whether it's in db in response
  }

  public onLogin() {
    this.router.navigate(['user']);
    // for (const index in this.users$) {
    //   if (!this.users$.hasOwnProperty(index)) { continue; }

    //   const obj = this.users$[index];
    //   for (const prop in obj) {
    //     if (!obj.hasOwnProperty) { continue; }

    //     console.log(prop + ' = ' + obj[prop]);
    //   }
    // }
  }

  onSignUp() {
    this.router.navigate(['registration']);
  }

  ngOnInit() {
    this.data.getAccounts().subscribe(data => this.users$ = data);

    for (const index in this.users$) {
      if (!this.users$.hasOwnProperty(index)) { continue; }

      const obj = this.users$[index];
      for (const prop in obj) {
        if (!obj.hasOwnProperty) { continue; }

        console.log(prop + ' = ' + obj[prop]);
      }
    }
  }

}
