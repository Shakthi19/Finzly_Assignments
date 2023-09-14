import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JsonhtmlperformngComponent } from './jsonhtmlperformng.component';

describe('JsonhtmlperformngComponent', () => {
  let component: JsonhtmlperformngComponent;
  let fixture: ComponentFixture<JsonhtmlperformngComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JsonhtmlperformngComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JsonhtmlperformngComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
