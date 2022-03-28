import { Component, OnInit } from '@angular/core';
import { LoginComponent } from './login/login.component';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-public',
  templateUrl: './public.component.html',
  styleUrls: ['./public.component.scss']
})
export class PublicComponent implements OnInit {

  constructor(private route: ActivatedRoute, private loginComponent: LoginComponent) { }

  ngOnInit(): void {
  }

}
