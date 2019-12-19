import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { URL } from './app.constants';
import { Observable } from 'rxjs';
import { map, pluck } from 'rxjs/operators';
import { ResponseDTO } from './app.model';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http: HttpClient) { }

  getAllEmployees(): Observable<any> {
    return this.http.get(`${URL}/getAllEmployees`);
  }

  getEmployeeById(id: number): Observable<any> {
    return this.http.get(`${URL}/getEmployeeById/${id}`);
  }
}
