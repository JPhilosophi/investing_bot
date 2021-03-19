package com.jphilosophi.investing_bot.test_controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public ResponseEntity<String> test(@RequestParam(required = false) String name){
//        return "Hello " + name;
        if (name == null){
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>("Hello "+ name, HttpStatus.OK);

    }
}
