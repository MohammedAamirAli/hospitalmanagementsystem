import { Component, OnInit } from '@angular/core';
import { DocterInfo } from '../docter-info';
import { DocterserviceService } from '../docterservice.service';
import { PatientInfo } from '../patient-info';
import { PatientserviceService } from '../patientservice.service';

@Component({
  selector: 'app-patientregister',
  templateUrl: './patientregister.component.html',
  styleUrls: ['./patientregister.component.css']
})
export class PatientregisterComponent implements OnInit {
  doctors:DocterInfo[] | undefined;
  patientinfo:PatientInfo=new PatientInfo( 0,"", 0,"","","");
  message:any;
  constructor(private service:PatientserviceService,private service1:DocterserviceService) { }

  ngOnInit() {
  }
  public registernow(){
   let resp= this.service.createpatient(this.patientinfo);
   resp.subscribe((data)=>this.message=data);
   console.log(this.patientinfo);
  }
  public finddoctors(){
    let res=this.service1.getalldocter();
    res.subscribe(data=>{this.doctors=data});
    console.log(this.doctors);
    
  }
}
