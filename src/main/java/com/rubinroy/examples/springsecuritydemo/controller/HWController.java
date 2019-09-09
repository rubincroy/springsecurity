package com.rubinroy.examples.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {

    @GetMapping(value = "/helloWorld/{name}/{surname}")
    public String getHelloWorldMessage(@PathVariable(value = "name") String name, @PathVariable(value = "surname") String surname) {
        return "Hello World, " + name + " " + surname + ".!!!!";
    }
}
