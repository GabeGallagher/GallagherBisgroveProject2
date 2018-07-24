import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  constructor() { }

  clickMessage = '';

  onClick() {
    this.clickMessage = 'You Have Purchased the Item!';
    // logic for inserting transactions into DB goes here
  }

  ngOnInit() {
  }
}
