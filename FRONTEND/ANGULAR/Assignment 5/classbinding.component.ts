import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {

  statement:string="Class Binding Statement";
  statementStyles = {
    italic:false,
    purpleText: false
  }


  constructor() { }

  changeStatementStyle() {
    this.statementStyles.italic = !this.statementStyles.italic;
    this.statementStyles.purpleText = !this.statementStyles.purpleText;
  }
  ngOnInit(): void {
  }

}
