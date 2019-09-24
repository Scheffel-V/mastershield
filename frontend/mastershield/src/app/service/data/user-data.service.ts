import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { User } from 'src/app/user/user.component';
import { API_URL } from 'src/app/app.constants';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserDataService {

  constructor(
    private http : HttpClient
  ) { }

  getAllUsers() {
    return this.http.get<User[]>(
      `${API_URL}/users`
    )
  }

  getUser(userId : number) {
    return this.http.get<User>(`${API_URL}/users/${userId.toString()}`)
  }

  createUser(user : User) : Observable<User> {
    return this.http.post<User>(
      `${API_URL}/users`,
      user
    )
  }

  updateUser(userId : number, user : User) : Observable<User> {
    return this.http.put<User>(
      `${API_URL}/users/${userId.toString()}`,
      user
    )
  }

  deleteUser(userId : number) {
    return this.http.delete(`${API_URL}/users/${userId.toString()}`)
  }
}
