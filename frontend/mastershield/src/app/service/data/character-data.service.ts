import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Character } from 'src/app/character/character.component';
import { API_URL } from 'src/app/app.constants';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CharacterDataService {

  constructor(
    private http : HttpClient
  ) { }

  getAllCharacters() {
    return this.http.get<Character[]>(
      `${API_URL}/characters`
    )
  }

  getAllCharactersByUserId(userId : number) {
    return this.http.get<Character[]>(
      `${API_URL}/users/${userId.toString()}/characters`
    )
  }

  getCharacter(userId : number, characterId : number) {
    return this.http.get<Character>(`${API_URL}/users/${userId}/characters/${characterId}`)
  }

  createCharacter(userId : number, character : Character) : Observable<Character> {
    return this.http.post<Character>(
      `${API_URL}/users/${userId}/characters`,
      character
    )
  }

  updateCharacter(userId : number, character : Character) : Observable<Character> {
    return this.http.put<Character>(
      `${API_URL}/users/${userId}/characters/${character.id}`,
      character
    )
  }

  deleteCharacter(userId : number, characterId : number) {
    return this.http.delete(`${API_URL}/users/${userId}`)
  }
}
