import { PatientInfo } from './patient-info';

describe('PatientInfo', () => {
  it('should create an instance', () => {
    expect(new PatientInfo(0,"",0,"","","")).toBeTruthy();
  });
});
