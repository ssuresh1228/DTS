import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AngularMaterialModule } from './angular-material/angular-material.module';

//Components below
import { UserListComponent } from './Components/user-list/user-list.component';
import { CreateUserComponent } from './Components/create-user/create-user.component';
import { UpdateUserComponent } from './Components/update-user/update-user.component';
import { TicketListComponent } from './Components/ticket-list/ticket-list.component';
import { CreateTicketComponent } from './Components/create-ticket/create-ticket.component';
import { CommentListComponent } from './Components/comment-list/comment-list.component';
import { CreateCommentComponent } from './Components/create-comment/create-comment.component';

//Daniel Imports Below this

import { MatSidenavModule } from '@angular/material/sidenav';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';

//Daniel Imports Above this

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    CreateUserComponent,
    UpdateUserComponent,
    TicketListComponent,
    CreateTicketComponent,
    CommentListComponent,
    CreateCommentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    //Daniel Imports below here
    BrowserAnimationsModule,
    MatSidenavModule,
    ReactiveFormsModule,
    MatButtonModule,
    //Daniel Imports above here
    //Russell Import
    AngularMaterialModule,
    //Russell Import
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
