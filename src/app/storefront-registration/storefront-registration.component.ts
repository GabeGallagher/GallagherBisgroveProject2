import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-storefront-registration',
  templateUrl: './storefront-registration.component.html',
  styleUrls: ['./storefront-registration.component.css']
})
export class StorefrontRegistrationComponent implements OnInit {

  constructor(private router: Router) { }

  clickMessage = '';

  onSubmit() {
    this.clickMessage = 'Storefront Submitted!';
    // Logic for inserting store object to db
  }

  onGoUser() {
    this.router.navigate(['user']);
  }

  onGoStorefront() {
    this.router.navigate(['storefront']);
  }

  ngOnInit() {
  }

}
