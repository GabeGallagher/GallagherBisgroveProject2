import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  constructor(private router: Router, private http: HttpClient) { }

  clickMessage = '';

  onClick() {
    this.clickMessage = 'You Have Purchased the Item!';
    // logic for inserting transactions into DB goes here
  }

  onBack() {
    this.router.navigate(['user']);
  }

  ngOnInit() {
  }
}
