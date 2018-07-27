import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor() { }

  onSubmit() {
    console.log('Registration submitted');
    // TODO insert infor into Accounts and users tables
  }

  ngOnInit() {
  }

}
