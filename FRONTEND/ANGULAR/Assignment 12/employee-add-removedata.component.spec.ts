import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeAddRemovedataComponent } from './employee-add-removedata.component';

describe('EmployeeAddRemovedataComponent', () => {
  let component: EmployeeAddRemovedataComponent;
  let fixture: ComponentFixture<EmployeeAddRemovedataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeAddRemovedataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeAddRemovedataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
