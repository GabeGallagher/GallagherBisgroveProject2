import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getAccounts() {
    return this.http.get('http://localhost:3000/ACCOUNTS');
  }

  getInventory() {
    return this.http.get('http://localhost:3000/ITEMS');
  }
}
