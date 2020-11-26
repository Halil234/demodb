import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../entity/user";
import {Notes} from "../entity/notes";

@Injectable({
  providedIn: 'root'
})
export class NotesService {

  private notesUrl: string;
  private notesAddUrl: string;

  constructor(private http: HttpClient) {
    this.notesUrl = 'http://localhost:8080/notes';
    this.notesAddUrl = 'http://localhost:8080/notesSave';
  }

  public findAll(): Observable<Notes[]> {
    return this.http.get<Notes[]>(this.notesUrl);
  }

  public save(note: Notes) {
    return this.http.post<Notes>(this.notesAddUrl, note);
  }
}
