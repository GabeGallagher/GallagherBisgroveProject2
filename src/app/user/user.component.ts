import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { Route, Router } from '@angular/router';
=======
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

<<<<<<< HEAD
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
=======
  constructor() { }

  ngOnInit() {
  }

>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5
}
