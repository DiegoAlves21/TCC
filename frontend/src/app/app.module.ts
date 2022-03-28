import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { CollapseModule } from 'ngx-bootstrap/collapse';
import { ToastrModule } from 'ngx-toastr';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { FooterComponent } from './components/footer/footer.component';
import { DashboardComponent } from './private/pages/dashboard/dashboard.component';
import { TablesComponent } from './private/pages/tables/tables.component';
import { FormsComponent } from './private/pages/forms/forms.component';
import { TypographyComponent } from './private/pages/typography/typography.component';
import { MapsComponent } from './private/pages/maps/maps.component';
import { NotificationsComponent } from './private/pages/notifications/notifications.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PublicComponent } from './public/public.component';
import { LoginComponent } from './public/login/login.component';
import { PrivateComponent } from './private/private.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidebarComponent,
    FooterComponent,
    DashboardComponent,
    TablesComponent,
    FormsComponent,
    TypographyComponent,
    MapsComponent,
    NotificationsComponent,
    PublicComponent,
    LoginComponent,
    PrivateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    BrowserAnimationsModule,
    CollapseModule.forRoot(),
    ToastrModule.forRoot(),
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
