import { Component } from '@angular/core';
import { BlogService } from './service/blog.service';
import { Blogmodel } from './models/blogmodel';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'routingdemo';
  public blogs:Blogmodel[]
  constructor(private blogService:BlogService){}

  public  getAllBlogs(){
    console.log('inside');
    let output = this.blogService.getAllBlogs().subscribe(data=>this.blogs=data);
    console.log(output)
    console.log(this.blogs)
  }

}
