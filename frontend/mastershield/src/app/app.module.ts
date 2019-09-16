import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { MenuComponent } from './menu/menu.component';
import { FootbarComponent } from './footbar/footbar.component';
import { UserComponent } from './user/user.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http'; 
import { HttpIntercepterBasicAuthService } from './service/http/http-intercepter-basic-auth.service';
import { ErrorComponent } from './error/error.component';
import { LogoutComponent } from './logout/logout.component';
import { MyCharactersComponent } from './my-characters/my-characters.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MenuComponent,
    FootbarComponent,
    UserComponent,
    ErrorComponent,
    LogoutComponent,
    MyCharactersComponent,
    SignInComponent,
    LoginComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    { provide : HTTP_INTERCEPTORS, useClass : HttpIntercepterBasicAuthService, multi : true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
