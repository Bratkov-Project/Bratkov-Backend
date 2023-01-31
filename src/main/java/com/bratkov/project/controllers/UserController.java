package com.bratkov.project.controllers;

import com.bratkov.project.dtos.UserDTO;
import com.bratkov.project.exceptions.InvalidValueException;
import com.bratkov.project.models.JsonResonse;
import com.bratkov.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@CrossOrigin (origins = "${BRATKOV_FRONTEND_URL}", allowCredentials = "true" )
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity <JsonResonse> getAllCustomers() {
        return ResponseEntity.ok(new JsonResonse("Got all users", this.userService.getAllUsers(), true));
    }

    public ResponseEntity <JsonResonse> createUser (@RequestBody UserDTO body) throws InvalidValueException {

        if (body.getEmail () == null || body.getUsername () == null || body.getPassword () == null) {
            throw new InvalidValueException ("Invalid user");
        }

        if (body.getEmail ().trim ().equals ("") || body.getUsername ().trim ().equals ("") || body.getPassword ().trim ().equals ("")) {
            throw new InvalidValueException ("Invalid user");
        }

        if (!body.getUsername ().matches ("^[\\w-]+$")) {
            throw new InvalidValueException ("Invalid username");
        }

        if (!body.getEmail ().matches ("^[\\w-\\.]+@[\\w-]+\\.[a-zA-z]+$")) {
            throw new InvalidValueException ("Invalid email");
        }

        return ResponseEntity.ok(new JsonResonse("Created a new user with id:" + body.getId(), this.userService.createUser(body), true));
    }

}
