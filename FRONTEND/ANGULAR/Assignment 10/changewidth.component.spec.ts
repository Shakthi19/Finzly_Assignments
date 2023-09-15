import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangewidthComponent } from './changewidth.component';

describe('ChangewidthComponent', () => {
  let component: ChangewidthComponent;
  let fixture: ComponentFixture<ChangewidthComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChangewidthComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChangewidthComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
