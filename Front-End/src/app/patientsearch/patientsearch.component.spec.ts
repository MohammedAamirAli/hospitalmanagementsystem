import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientsearchComponent } from './patientsearch.component';

describe('PatientsearchComponent', () => {
  let component: PatientsearchComponent;
  let fixture: ComponentFixture<PatientsearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatientsearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PatientsearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
