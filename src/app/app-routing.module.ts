import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
<<<<<<< HEAD
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { ItemComponent } from './item/item.component';
import { RegistrationComponent} from './registration/registration.component';
import { ComplaintComponent } from './complaint/complaint.component';
=======
import {Routes, RouterModule } from '@angular/router';
import { ItemComponent } from './item/item.component';
import { UserComponent } from './user/user.component';
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5

const routes: Routes = [
  {
    path: '',
<<<<<<< HEAD
    component: LoginComponent
  },
  {
    path: 'user',
=======
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5
    component: UserComponent
  },
  {
    path: 'item',
    component: ItemComponent
<<<<<<< HEAD
  },
  {
    path: 'registration',
    component: RegistrationComponent
  },
  {
    path: 'complaint',
    component: ComplaintComponent
=======
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5
  }
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
<<<<<<< HEAD
  exports: [RouterModule],
=======
  exports: [
    RouterModule
  ],
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5
  declarations: []
})
export class AppRoutingModule { }
