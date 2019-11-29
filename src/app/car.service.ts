import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import {FormsModule} from "@angular/forms";
import 'rxjs/add/operator/map';
import { CARS } from './mock-cars';
import { Car } from './car';

@Injectable({
  providedIn: 'root'
})
export class CarService {
  private car: Car;


  constructor(private http: HttpClient) {}

  getCars(): Promise<Car[]>{
    return Promise.resolve(CARS);
  }

  getCar(plateNumber: string): Promise<Car> {
    return Promise.resolve(CARS.find(car => car.plateNumber==plateNumber));
  }

  getCarsWithObservable(): Observable<any> {
    return this.http.get("http://localhost:8080/cars").map((response: Response) => response);
  }

   getCarWithObservable(plateNumber): Observable<any> {
      return this.http.get("http://localhost:8080/cars/"+plateNumber).map((response: Response) => response);
   }

   create_car(car): void {
    CARS.push(car);
    console.log(CARS);
    this.saveAppareilsToServer(car);

   }

  saveAppareilsToServer(car) {
    this.http
      .post('http://localhost:8080/cars', car)
      .subscribe(
        () => {
          console.log('Enregistrement terminé !');
        },
        (error) => {
          console.log('Erreur ! : ' + error);
        }
      );
  }


}
