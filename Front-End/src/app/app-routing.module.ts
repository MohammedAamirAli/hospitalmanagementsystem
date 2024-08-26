import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DocterregisterComponent } from './docterregister/docterregister.component';
import { DoctersearchComponent } from './doctersearch/doctersearch.component';
import { PatientregisterComponent } from './patientregister/patientregister.component';
import { PatientsearchComponent } from './patientsearch/patientsearch.component';

const routes: Routes = [
  
  {path:'patientregister', component : PatientregisterComponent},
  {path:'docterregister',component:DocterregisterComponent},
  {path:'patientsearch',component:PatientsearchComponent},
  {path:'doctersearch',component:DoctersearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
