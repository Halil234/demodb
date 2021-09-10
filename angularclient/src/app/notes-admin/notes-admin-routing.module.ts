import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NotesListComponent } from './notes-list/notes-list.component';
import {NotesFormComponent} from './notes-form/notes-form.component';
import {NotesLastComponent} from './notes-last/notes-last.component';


const routes: Routes = [
    { path: 'notes-list', component: NotesListComponent },

    { path: 'notes-form', component: NotesFormComponent },

    { path: 'notes-last', component: NotesLastComponent },
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})

export class NotesAdminRoutingModule {
}
