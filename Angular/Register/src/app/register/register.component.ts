import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { UserregistrationService } from '../user-registration.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
//user:User=new User("","","",0);
user:User = new User ("","","",0)
message:any;

constructor(private service:UserregistrationService){

}
ngOnInit(): void {
    
}
public registerNow(){
  let resp=this.service.findAllUsers(this.user);
  resp.subscribe((data)=>this.message=data);
    }

}
