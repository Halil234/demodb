import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NotesService } from '../../service/notes.service';
import { Notes } from '../../entity/notes';

@Component({
  selector: 'app-notes-form',
  templateUrl: './notes-form.component.html',
  styleUrls: ['./notes-form.component.scss']
})
export class NotesFormComponent {

  notes: Notes;

  constructor(
      private route: ActivatedRoute,
      private router: Router,
      private notesService: NotesService) {
    this.notes = new Notes();
  }

  onSubmit() {
    this.notesService.save(this.notes).subscribe(result => this.gotoNotesList());
  }

  gotoNotesList() {
    this.router.navigate(['/notes-admin/notes-list']);
  }
}
