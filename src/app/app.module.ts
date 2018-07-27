import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ItemComponent } from './item/item.component';
<<<<<<< HEAD
import { AppRoutingModule } from './/app-routing.module';
import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RegistrationComponent } from './registration/registration.component';
import { ComplaintComponent } from './complaint/complaint.component';
=======
import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5

@NgModule({
  declarations: [
    AppComponent,
    ItemComponent,
    UserComponent,
<<<<<<< HEAD
    LoginComponent,
    RegistrationComponent,
    ComplaintComponent
=======
    LoginComponent
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
    NgbModule.forRoot()
=======
    NgbModule
>>>>>>> 5fbafc1de8a9c16e78eb38a910f47cac4bf60dd5
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
