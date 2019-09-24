import { Component, OnInit } from '@angular/core';
import { BasicAuthenticationService } from '../service/basic-authentication.service';
import { Router } from '@angular/router';
import { CharacterDataService } from '../service/data/character-data.service';
import { Character } from '../character/character.component';

@Component({
  selector: 'app-my-characters',
  templateUrl: './my-characters.component.html',
  styleUrls: ['./my-characters.component.css']
})
export class MyCharactersComponent implements OnInit {

  characters : Character[]
  message : string

  constructor(
    private characterService : CharacterDataService,
    private basicAuthService : BasicAuthenticationService,
    private router : Router
  ) { }

  ngOnInit() {
    this.refreshCharacters()
  }

  refreshCharacters() {
    this.characterService.getAllCharactersByUserId(this.basicAuthService.getAuthenticatedUserId()).subscribe(
      response => {
        this.characters = response;
      }
    )
  }

  deleteCharacter(characterId) {
    this.characterService.deleteCharacter(this.basicAuthService.getAuthenticatedUserId(), characterId).subscribe(
      response => {
        this.message = 'Deleted character!'
        this.refreshCharacters()
      }
    )
  }

  updateCharacter(characterId) {
    this.router.navigate(['my_characters', characterId])
  }

  createCharacter() {
    this.router.navigate(['my_characters', -1])
  }
}
