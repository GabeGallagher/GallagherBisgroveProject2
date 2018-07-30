import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private router: Router) { }

  onBrowseItem() {
    this.router.navigate(['item']);
  }

  onSubmitComplaint() {
    this.router.navigate(['complaint']);
  }

  onLogout() {
    this.router.navigate(['']);
  }

  ngOnInit() {
  }
}
