import { Component, OnInit } from '@angular/core';
import { UserAdminRoutingModule } from './user-admin-routing.module';

@Component({
  selector: 'app-user-admin',
  templateUrl: './user-admin.component.html',
  styleUrls: ['./user-admin.component.scss']
})
export class UserAdminComponent implements OnInit {

  title: string;

  ngOnInit() {
    this.title = 'Spring Boot - Angular Application';
  }

}
