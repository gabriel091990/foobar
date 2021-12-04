import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private http: HttpClient) { }

  convertNumber(inputNumber: number): void {
    //return this.http.get('/foo-bar-quix', {param:inputNumber, responseType: 'json'});
    }
}
