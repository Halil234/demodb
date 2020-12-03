import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import {Notes} from "../../entity/notes";
import {NotesService} from "../../service/notes.service";

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
      private userService: NotesService) {
      this.notes = new Notes();
  }

  onSubmit() {
    this.userService.save(this.notes).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/notes-admin/notes-list']);
  }
}
