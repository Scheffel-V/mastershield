import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { logging } from 'protractor';
import { RouteGuardService } from './service/route-guard.service';
import { ErrorComponent } from './error/error.component';
import { LogoutComponent } from './logout/logout.component';
import { MyCharactersComponent } from './my-characters/my-characters.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'sign_in', component: SignInComponent },
  { path: 'my_characters', component: MyCharactersComponent, canActivate: [RouteGuardService] },
  { path: 'logout', component: LogoutComponent, canActivate: [RouteGuardService] },
  { path: 'welcome', component: WelcomeComponent, canActivate: [RouteGuardService]},
  { path: '**', component: ErrorComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
