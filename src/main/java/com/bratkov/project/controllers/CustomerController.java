package com.bratkov.project.controllers;

import com.bratkov.project.models.JsonResonse;
import com.bratkov.project.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@CrossOrigin (origins = "${BRATKOV_FRONTEND_URL}", allowCredentials = "true" )
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController (CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity <JsonResonse> getAllCustomers() {
        return ResponseEntity.ok(new JsonResonse("Got all users", this.customerService.getAllCustomers(), true));
    }

}
