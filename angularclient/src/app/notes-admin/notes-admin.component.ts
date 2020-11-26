import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-notes-admin',
  templateUrl: './notes-admin.component.html',
  styleUrls: ['./notes-admin.component.scss']
})
export class NotesAdminComponent implements OnInit {

  title: string;

  ngOnInit() {
    this.title = 'Spring Boot - Angular Application';
  }

}
