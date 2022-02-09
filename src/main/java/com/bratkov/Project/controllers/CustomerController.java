package com.bratkov.Project.controllers;

import com.bratkov.Project.services.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@CrossOrigin (origins = "${BRATKOV_FRONTEND_URL}", allowCredentials = "true" )
public class CustomerController {

    private final CustomerService customerService;

    

}
