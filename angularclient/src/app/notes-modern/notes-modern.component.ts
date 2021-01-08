import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-notes-modern',
  templateUrl: './notes-modern.component.html',
  styleUrls: ['./notes-modern.component.scss']
})
export class NotesModernComponent implements OnInit {
  searchText: string;

  constructor() { }

  ngOnInit(): void {
  }

}
