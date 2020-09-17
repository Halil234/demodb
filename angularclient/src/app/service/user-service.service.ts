import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../entity/user';
import { Observable } from 'rxjs';


@Injectable()
// @ts-ignore
export class UserService {

  private usersUrl: string;
  private userAddUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/person';
    this.userAddUrl = 'http://localhost:8080/personSave';
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl);
  }

  public save(user: User) {
    return this.http.post<User>(this.userAddUrl, user);
  }
}
