import { HttpClient } from '@angular/common/http';

import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientInfo } from './patient-info';

@Injectable({
  providedIn: 'root'
})
export class PatientserviceService {

  constructor(private http:HttpClient) { }

  public createpatient(patientinfo:PatientInfo):Observable<object>{
       return this.http.post("http://localhost:8080/registerpatient",patientinfo,{responseType:'text' as 'json'})
  }
  public getUserById(id){
    return this.http.get("http://localhost:8080/findUser/"+id);
  }
}
