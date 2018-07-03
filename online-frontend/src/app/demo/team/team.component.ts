import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-team',
  templateUrl: './team.component.html',
  styleUrls: ['./team.component.css']
})
export class TeamComponent implements OnInit {

  teamPersons: any;

  constructor(private http: HttpClient) { }

  ngOnInit() {

    this.http.get('/demo/persons').subscribe(data => {
      this.teamPersons = data;
    });

  }

}
