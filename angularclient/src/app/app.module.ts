import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-admin/user-list/user-list.component';
import {UserService} from './service/user-service.service';
import {HttpClient, HttpClientModule, HttpHandler} from "@angular/common/http";
import { UserFormComponent } from './user-admin/user-form/user-form.component';
import {FormsModule} from "@angular/forms";
import { NavigationComponent } from './navigation/navigation.component';
import { UserAdminComponent } from './user-admin/user-admin.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    NavigationComponent,
    UserAdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
