import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit {

  inventory$: Object;

  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getInventory().subscribe(
      data => this.inventory$ = data
    );
  }

}
