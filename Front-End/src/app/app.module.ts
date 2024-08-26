import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientregisterComponent } from './patientregister/patientregister.component';
import { PatientsearchComponent } from './patientsearch/patientsearch.component';
import { PatientserviceService } from './patientservice.service';
import {HttpClientModule} from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { DocterregisterComponent } from './docterregister/docterregister.component';
import { DoctersearchComponent } from './doctersearch/doctersearch.component';

@NgModule({
  declarations: [
    AppComponent,
    PatientregisterComponent,
    PatientsearchComponent,
    DocterregisterComponent,
    DoctersearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [PatientserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
