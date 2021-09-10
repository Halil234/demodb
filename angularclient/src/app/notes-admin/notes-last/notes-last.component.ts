import { Component, OnInit } from '@angular/core';
import {NotesService} from "../../service/notes.service";
import {Notes} from "../../entity/notes";

@Component({
  selector: 'app-notes',
  templateUrl: './notes-last.component.html',
  styleUrls: ['./notes-last.component.scss']
})
export class NotesLastComponent implements OnInit {

  notes: Notes[];

  constructor(private notesService: NotesService) {
  }

  ngOnInit() {
    this.notesService.findAll().subscribe(data => {
      this.notes = data;
    });
  }

}
