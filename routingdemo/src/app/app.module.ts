import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule,RoutingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { BlogsComponent } from './blogs/blogs.component';
import { BlogdetailComponent } from './blogdetail/blogdetail.component';
import { HttpClientModule } from "@angular/common/http";
import { BlogService } from './service/blog.service';


@NgModule({
  declarations: [
    AppComponent,
   RoutingComponents,
   EmployeesComponent,
   BlogsComponent,
   BlogdetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [BlogService],
  bootstrap: [AppComponent]
})
export class AppModule { }
