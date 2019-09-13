import { Component, OnInit } from '@angular/core';
import { User } from '../user/user.component';
import { BasicAuthenticationService } from '../service/basic-authentication.service';
import { UserDataService } from '../service/data/user-data.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  id : string = "-1"
  confirmPassword : string = ""
  user : User
  message : string

  constructor(
    private basicAuthService : BasicAuthenticationService,
    private userService : UserDataService,
    private activatedRoute : ActivatedRoute,
    private router : Router,
    private location : Location
    ) { }

  ngOnInit() {
    let id = this.activatedRoute.snapshot.params['userId']
    if(id) {
      this.id = id
    }
    this.user = new User(0, "", "")

    if(+this.id != -1) {
      this.userService.getUser(
        this.id
        ).subscribe(
          data => {
            this.user = data
          }
        )
    }
  }

  saveUser() {
    if(+this.id == -1) {
      this.userService.createUser(
        this.user
      ).subscribe(
        data => {
          this.location.back()
        }
      )
    } else {
      this.userService.updateuser(
        this.id,
        this.user
      ).subscribe(
        data => {
          this.location.back()
        }
      )
    }
  }

  backPage() {
    this.location.back()
  }
}
