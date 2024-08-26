import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocterregisterComponent } from './docterregister.component';

describe('DocterregisterComponent', () => {
  let component: DocterregisterComponent;
  let fixture: ComponentFixture<DocterregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DocterregisterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DocterregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
