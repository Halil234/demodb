import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-admin/user-list/user-list.component';
import {UserFormComponent} from "./user-admin/user-form/user-form.component";
import {UserAdminComponent} from "./user-admin/user-admin.component";
import {NotesListComponent} from "./notes-admin/notes-list/notes-list.component";
import {NotesAdminComponent} from "./notes-admin/notes-admin.component";



const routes: Routes = [
  { path: '', redirectTo: 'user-admin/users', pathMatch: 'full'},
  { path: 'user-admin',
    component: UserAdminComponent,
    children: [
      { path: 'users', component: UserListComponent },
      { path: 'user-form', component: UserFormComponent }
    ]
  },
  { path: 'notes-admin',
    component: NotesAdminComponent,
    children: [
      { path: 'notes', component: NotesListComponent },
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
