import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Person } from '../model/person';
import { Observable } from 'rxjs';



@Injectable()
export class PersonService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/person';
  }

  public findAll(): Observable<Person[]> {
    return this.http.get<Person[]>(this.usersUrl);
  }

  public save(person: Person) {
    return this.http.post<Person>(this.usersUrl, person);
  }
}
