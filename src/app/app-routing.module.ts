import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { ItemComponent } from './item/item.component';
import { RegistrationComponent} from './registration/registration.component';
import { ComplaintComponent } from './complaint/complaint.component';
import { StorefrontComponent } from './storefront/storefront.component';
import { StorefrontRegistrationComponent } from './storefront-registration/storefront-registration.component';
import { InventoryComponent} from './inventory/inventory.component';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent
  },
  {
    path: 'user',
    component: UserComponent
  },
  {
    path: 'item',
    component: ItemComponent
  },
  {
    path: 'inventory/:ITEMID',
    component: InventoryComponent
  },
  {
    path: 'registration',
    component: RegistrationComponent
  },
  {
    path: 'complaint',
    component: ComplaintComponent
  },
  {
    path: 'storefront',
    component: StorefrontComponent
  },
  {
    path: 'storefront-registration',
    component: StorefrontRegistrationComponent
  }
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
