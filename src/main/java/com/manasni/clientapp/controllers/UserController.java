package com.manasni.clientapp.controllers;

import com.manasni.clientapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public String getUsers() {
    return employeeService.getDetails();
  }
}
