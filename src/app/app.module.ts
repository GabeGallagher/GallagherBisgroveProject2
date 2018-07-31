import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { ItemComponent } from './item/item.component';
import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { ComplaintComponent } from './complaint/complaint.component';
import { StorefrontComponent } from './storefront/storefront.component';
import { StorefrontRegistrationComponent } from './storefront-registration/storefront-registration.component';
import { InventoryComponent } from './inventory/inventory.component';

@NgModule({
  declarations: [
    AppComponent,
    ItemComponent,
    UserComponent,
    LoginComponent,
    RegistrationComponent,
    ComplaintComponent,
    StorefrontComponent,
    StorefrontRegistrationComponent,
    InventoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
