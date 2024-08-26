import { Component, OnInit } from '@angular/core';
import { DocterserviceService } from '../docterservice.service';
import { PatientserviceService } from '../patientservice.service';

@Component({
  selector: 'app-patientsearch',
  templateUrl: './patientsearch.component.html',
  styleUrls: ['./patientsearch.component.css']
})
export class PatientsearchComponent implements OnInit {
   doctors:any;
  patients:any;
  id:number | undefined;
  constructor(private service:PatientserviceService) { }

  ngOnInit(): void {
  }
public findpatientById(){
  let resp=this.service.getUserById(this.id);
  resp.subscribe(data=>{this.patients=data;
    this.patients=Array.of(this.patients);
  });
  console.log(this.id);
  console.log();
}

}
