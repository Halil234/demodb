import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import {UserFormComponent} from "./user-form/user-form.component";
import {UserAdminComponent} from "./user-admin.component";



const routes: Routes = [
    { path: 'users', component: UserListComponent },

    { path: 'user-admin', component: UserAdminComponent },
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})

export class UserAdminRoutingModule {
}
