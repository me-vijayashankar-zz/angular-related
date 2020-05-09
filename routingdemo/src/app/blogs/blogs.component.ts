import { Component, OnInit } from '@angular/core';
import { BlogService } from '../service/blog.service';
import { Blogmodel } from '../models/blogmodel';
import { Router, NavigationExtras } from '@angular/router';

@Component({
  selector: 'app-blogs',
  templateUrl: './blogs.component.html',
  styleUrls: ['./blogs.component.css']
})
export class BlogsComponent implements OnInit {

  constructor(private blogService: BlogService, private router: Router) { }

  blogs: Blogmodel[]
  ngOnInit(): void {
    this.blogService.getAllBlogs().subscribe(data => this.blogs = data);
  }
  showDeptDetails(blog: Blogmodel) {
    let navigationExtras: NavigationExtras = {
      // queryParams: {
      //   'id': blog.id,
      //   "name": "vijay"
      // },
      state: blog
    }
    this.router.navigate(['blog/detail'], navigationExtras)
  }
}
