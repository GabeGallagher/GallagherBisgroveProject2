import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-storefront',
  templateUrl: './storefront.component.html',
  styleUrls: ['./storefront.component.css']
})
export class StorefrontComponent implements OnInit {

  clickMessage = '';

  constructor(private router: Router) { }

  onShowInventory() {
    this.clickMessage = 'Inventory currently not implemented, but the button works!';
    // logic for inserting transactions into DB goes here
  }

  onToAccount() {
    this.router.navigate(['user']);
  }

  ngOnInit() {
  }

}
