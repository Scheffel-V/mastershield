import { Component, OnInit } from '@angular/core';


export class User {
  
  constructor(
    public id : number,
    public username : string,
    public password : string
  ) {

  }
}

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
