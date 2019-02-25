import { Component, OnInit } from '@angular/core';
import {tipoinmueble} from "../model/tipoinmueble";
import { CrudService } from '../components/crud-service';
import { Router } from '@angular/router';


@Component({
  selector: 'login-app',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

 
  constructor(public crudService: CrudService, public router:Router) { }
  
  
  


  ngOnInit() {
        
  }


  private consultarDatosLogin() {

    this.crudService.get("/usuario/1").subscribe(
      response => {
        console.log("linea numero 29 :::::: " + JSON.stringify(response));
        localStorage.setItem("FLAG_LOGIN",'true');
     
        this.router.navigate(['/user-profile']);
      }
    )
  }
  

}
