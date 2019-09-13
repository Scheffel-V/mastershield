import { Component, OnInit } from '@angular/core';
import { BasicAuthenticationService } from '../service/basic-authentication.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  username : string = ''

  constructor(private basicAuthenticationService : BasicAuthenticationService) { }

  ngOnInit() {
  }

  manageAccounts() {
    
  }

  getBasicAuthService() {
    return this.basicAuthenticationService
  }
}
