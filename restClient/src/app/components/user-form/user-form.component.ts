import { Component, OnInit } from '@angular/core';
import { UserService } from './../../shared-service/user.service';
import { User } from './../../user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  private user: User;

  constructor(private userService: UserService, private router: Router) { }

  ngOnInit() {
    this.user = this.userService.getter();
  }

  processForm() {
    if (this.user.id === undefined) {
      this.userService.createUser(this.user).subscribe((user) => {
        this.router.navigate(['/']);
      }, (error) => {
        console.log(error);
      });
    } else {
      this.userService.createUser(this.user).subscribe((user) => {
        this.router.navigate(['/']);
      }, (error) => {
        console.log(error);
      });
    }
  }

}
