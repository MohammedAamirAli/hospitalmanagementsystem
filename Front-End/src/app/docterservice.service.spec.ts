import { TestBed } from '@angular/core/testing';

import { DocterserviceService } from './docterservice.service';

describe('DocterserviceService', () => {
  let service: DocterserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DocterserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
