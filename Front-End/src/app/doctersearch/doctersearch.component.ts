import { Component, OnInit } from '@angular/core';
import { DocterInfo } from '../docter-info';
import { DocterserviceService } from '../docterservice.service';

@Component({
  selector: 'app-doctersearch',
  templateUrl: './doctersearch.component.html',
  styleUrls: ['./doctersearch.component.css']
})
export class DoctersearchComponent implements OnInit {
   doctors:any;
   founddoctor:any;
   doctorname:String | undefined;
  constructor(private service:DocterserviceService ) { }

  ngOnInit(): void {
  }
  public finddoctorBydoctorname(){
    let resp=this.service.getUserBydoctorname(this.doctorname);
    resp.subscribe(data=>{this.doctors=data;
      this.doctors=Array.of(this.doctors);
    });
    console.log(this.doctorname);
    console.log();
  }
  public finddoctors(){
    let res=this.service.getalldocter();
    res.subscribe(data=>{this.founddoctor=data});
    console.log(this.founddoctor);
    
  }
}
