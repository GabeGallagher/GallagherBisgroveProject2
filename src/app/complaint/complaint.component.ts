import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-complaint',
  templateUrl: './complaint.component.html',
  styleUrls: ['./complaint.component.css']
})
export class ComplaintComponent implements OnInit {

  constructor(private router: Router) { }

  onSubmit() {
    this.router.navigate(['user']);
  }

  ngOnInit() {
  }

}
