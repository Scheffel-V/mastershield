import { Component, OnInit } from '@angular/core';
import { BasicAuthenticationService } from '../service/basic-authentication.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  username : string = ''
  welcomeMessageFromService : string

  constructor(
    private router : Router,
    private basicAuthService : BasicAuthenticationService
  ) { }

  ngOnInit() {
    this.username = this.basicAuthService.getAuthenticatedUserUsername()
  }

  manageCharacters() {
    this.router.navigate(['my_characters'])
  }
}
