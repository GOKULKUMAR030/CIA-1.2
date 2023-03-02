package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Employee_Controller 
{
   @GetMapping("/")
   public String homepage()
   {
	   return "Welcome to Student List";
   }
   @GetMapping("/List")
   public List<Employee> getList()
   {
	 List<Employee> detailsList=new ArrayList<>();
	 detailsList.add(new Employee(1,"ess","A"));
	 detailsList.add(new Employee(2,"iss","b")); 
	 detailsList.add(new Employee(4,"fgss","c"));
//	 detailsList.add(new student(5,"ssees","AAA"));
//	 detailsList.add(new student(8,"sss","AAA"));
     return detailsList;
   }
   
	   
   
   
}
