import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctersearchComponent } from './doctersearch.component';

describe('DoctersearchComponent', () => {
  let component: DoctersearchComponent;
  let fixture: ComponentFixture<DoctersearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctersearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctersearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
