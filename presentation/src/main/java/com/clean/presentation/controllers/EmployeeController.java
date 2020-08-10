package com.clean.presentation.controllers;

import com.clean.application.employee.models.EmployeeModel;
import com.clean.application.employee.queries.SearchEmployeeQuery;
import com.dirkheijnen.mediator.interfaces.IMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController  {

    @Autowired
    IMediator mediator;


    @GetMapping("/employees")
    public List<EmployeeModel> getEmployee(){
        return  mediator.send(new SearchEmployeeQuery());

    }
}
