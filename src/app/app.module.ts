import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ItemComponent } from './item/item.component';
import { AppRoutingModule } from './/app-routing.module';
import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RegistrationComponent } from './registration/registration.component';
import { ComplaintComponent } from './complaint/complaint.component';

@NgModule({
  declarations: [
    AppComponent,
    ItemComponent,
    UserComponent,
    LoginComponent,
    RegistrationComponent,
    ComplaintComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
