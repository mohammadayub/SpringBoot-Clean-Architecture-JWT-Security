package com.clean.presentation.controllers;


import com.clean.application.query.GetPagesQuery;
import com.dirkheijnen.mediator.interfaces.IMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    IMediator mediator;


    @GetMapping("/check")
    public String GetPages(){
        System.out.println("Running ");
        return mediator.send(new GetPagesQuery());
    }

}
