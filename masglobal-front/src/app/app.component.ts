import { Component } from '@angular/core';
import { AppService } from './app.service';
import { ResponseDTO } from './app.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  public id: number;
  public employeeList: any = [];
  public showAlert: boolean;

  constructor(private appService: AppService) {}

  makeRequest() {
    this.id ? 
    this.getEmployeeById() :
      this.getAllEmployees();
  }

  getAllEmployees() {
    this.appService.getAllEmployees()
      .subscribe(resp => {
        this.employeeList = resp;
        this.employeeList.length > 0 ?
          this.showAlert = false :
          this.showAlert = true; 
      });
  }

  getEmployeeById() {
    this.appService.getEmployeeById(this.id)
      .subscribe(resp => {
        this.employeeList = resp;
        this.employeeList.length > 0 ?
          this.showAlert = false :
          this.showAlert = true; 
      });
  }

}
