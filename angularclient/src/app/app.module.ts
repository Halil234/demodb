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
import {NotesAdminComponent} from "./notes-admin/notes-admin.component";
import {NotesListComponent} from "./notes-admin/notes-list/notes-list.component";
import {NotesFormComponent} from "./notes-admin/notes-form/notes-form.component";

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    NavigationComponent,
    UserAdminComponent,
    NotesAdminComponent,
    NotesListComponent,
    NotesFormComponent
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
