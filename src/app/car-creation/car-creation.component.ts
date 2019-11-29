import { Component, OnInit } from '@angular/core';
import {Car} from "../car";
import { CarService } from '../car.service';


@Component({
  selector: 'app-car-creation',
  templateUrl: './car-creation.component.html',
  styleUrls: ['./car-creation.component.css']
})
export class CarCreationComponent implements OnInit {
  car: Car = {

    brand:'',
    price: 0,
    plateNumber: ''
  };

  constructor(private CarService : CarService  ) { }

  ngOnInit() {
  }

  create(car){
    console.log(car);
    this.CarService.create_car(car);
  }

}
