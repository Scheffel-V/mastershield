import { Component, OnInit } from '@angular/core';
import { CharacterDataService } from '../service/data/character-data.service';
import { BasicAuthenticationService } from '../service/basic-authentication.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

export class Character {
  
  constructor(
    public id : number,
    public name : string
  ) {

  }
}

@Component({
  selector: 'app-character',
  templateUrl: './character.component.html',
  styleUrls: ['./character.component.css']
})
export class CharacterComponent implements OnInit {

  id : number
  name : string
  characterId : string
  character : Character

  constructor(
    private characterService : CharacterDataService,
    private basicAuthService : BasicAuthenticationService,
    private activatedRoute : ActivatedRoute,
    private location : Location
  ) { }

  ngOnInit() {
    this.id = this.activatedRoute.snapshot.params['characterId']
    this.character = new Character(+this.id, "")

    if(+this.id != -1) {
      this.characterService.getCharacter(
        this.basicAuthService.getAuthenticatedUserId(),
        this.id
        ).subscribe(
          data => {
            this.character = data
          }
        )
    }
  }

}
