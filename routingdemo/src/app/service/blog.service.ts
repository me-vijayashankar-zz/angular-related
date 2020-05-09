import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Blogmodel } from '../models/blogmodel';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BlogService {

  constructor(private http:HttpClient) { }

  public getAllBlogs() : Observable<Blogmodel[]>{
    console.log("inside service");
    let outputLog = this.http.get<Blogmodel[]>('http://localhost:8080/blogs/getall');
    console.log(outputLog);
    return outputLog;
  }

}
