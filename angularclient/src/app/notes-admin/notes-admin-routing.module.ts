import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NotesListComponent } from './notes-list/notes-list.component';
import {NotesFormComponent} from "./notes-form/notes-form.component";
import {NotesAdminComponent} from "./notes-admin.component";



const routes: Routes = [
    { path: 'notes-list', component: NotesListComponent },

    { path: 'notes-form', component: NotesFormComponent },
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})

export class NotesAdminRoutingModule {
}
