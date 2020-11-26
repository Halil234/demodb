import { Component, OnInit } from '@angular/core';
import {NotesService} from "../../service/notes.service";
import {Notes} from "../../entity/notes";

@Component({
  selector: 'app-notes',
  templateUrl: './notes-list.component.html',
  styleUrls: ['./notes-list.component.scss']
})
export class NotesListComponent implements OnInit {

  notes: Notes[];

  constructor(private notesService: NotesService) {
  }

  ngOnInit() {
    this.notesService.findAll().subscribe(data => {
      this.notes = data;
    });
  }

}
