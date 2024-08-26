import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { DocterInfo } from './docter-info';

@Injectable({
  providedIn: 'root'
})
export class DocterserviceService {

  constructor(private http:HttpClient) { }
  public createDoctor(doctorinfo:DocterInfo):Observable<object>{
    return this.http.post("http://localhost:8080/registerdocter",doctorinfo,{responseType:'text' as 'json'})
}
public getUserBydoctorname(doctorname){
  return this.http.get("http://localhost:8080/finddocter/"+doctorname);
}
public getalldocter():Observable<DocterInfo[]>{
 return this.http.get<DocterInfo[]>("http://localhost:8080/findAll");
}
}
