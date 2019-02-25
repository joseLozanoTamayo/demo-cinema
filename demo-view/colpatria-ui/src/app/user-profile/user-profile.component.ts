import { Component, OnInit } from '@angular/core';
import {tipoinmueble} from "../model/tipoinmueble";
import { CrudService } from '../components/crud-service';
import { ParkingDTO } from './parking-DTO';




@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {

  tiposimueble: tipoinmueble[] = [{id:1, descripcion: 'apartamento' },{id:2, descripcion: 'casa' },{id:3, descripcion: 'local' },];
  constructor(public crudUserProfileService: CrudService
    , public parking:ParkingDTO) { }
  
  
  


  ngOnInit() {
        
  }

  private consultarDato() {

    //  console.log("linea numero 26 :::: " + this.cilindraje);
    //  console.log("linea numero 27 :::: " + this.tipoVehiculo);
     console.log("linea numero 28 :::: " + this.parking.numPlaca);

    // this.crudUserProfileService.post("/wsValorationCenter/valorationCenterInformationWS", objeto).subscribe(
    //   response => {
    //     console.log("linea numero 24 :::::: " + JSON.stringify(response));
    //   }
    // )
  }

  

}
