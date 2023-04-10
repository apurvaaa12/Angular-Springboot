import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { User } from "./User";

@Injectable({
    providedIn: 'root'
  })
export class UserregistrationService {
    constructor(private http:HttpClient) { }

    public findAllUsers(user: User){
        return this.http.post("http://localhost:8090/findAllUsers",user);
      }

    // public findAllUsers(){
    //     return this.http.get("http://localhost:8090/findAllUsers");
    //   }

}
