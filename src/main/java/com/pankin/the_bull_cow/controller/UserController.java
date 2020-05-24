package com.pankin.the_bull_cow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Request controller from unregistered users
 */
@RestController
public class UserController {

    @GetMapping(value = "/index")
    public ResponseEntity getMainMenu(){
        return ResponseEntity.status(HttpStatus.OK).body("Главное меню");
    }
}
