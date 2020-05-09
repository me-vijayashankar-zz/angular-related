import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Blogmodel } from '../models/blogmodel';

@Component({
  selector: 'app-blogdetail',
  templateUrl: './blogdetail.component.html',
  styleUrls: ['./blogdetail.component.css']
})
export class BlogdetailComponent implements OnInit {

  blog: Blogmodel
  constructor(private route: ActivatedRoute, private router: Router) {

    console.log(this.router.getCurrentNavigation().extras.state);
  }

  public name: string;
  ngOnInit(): void {
    // let id = this.route.snapshot.paramMap.get('id');
    // console.log(id);
    // this.route.paramMap.subscribe((params: ParamMap) => {
    //   let id = params.get('id');
    //   let name = params['name']
    //   console.log(name)
    //   console.log(id);
    this.blog = history.state
  // });
}

}
