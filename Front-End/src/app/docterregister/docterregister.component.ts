import { Component, OnInit } from '@angular/core';
import { DocterInfo } from '../docter-info';
import { DocterserviceService } from '../docterservice.service';

@Component({
  selector: 'app-docterregister',
  templateUrl: './docterregister.component.html',
  styleUrls: ['./docterregister.component.css']
})
export class DocterregisterComponent implements OnInit {
   
  docterinfo:DocterInfo=new DocterInfo( "","",0);
  message:any;
  constructor(private service:DocterserviceService) { }
  

  ngOnInit(): void {
  }
  public registernow(){
    let resp= this.service.createDoctor(this.docterinfo);
    resp.subscribe((data)=>this.message=data);
    console.log(this.docterinfo);
   }

}
