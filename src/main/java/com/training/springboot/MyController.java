package com.training.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping(value = "/name")
    public String getName(){
        return "Aruna Sankari";
    }
    @GetMapping(value = "/")
    public String getData(){
        return "Springboot Testing";
    }
    @GetMapping(value = "/name/{hobby}")
    public String getHobby(@PathVariable("hobby") String hobby){
        return "My hobby is "+hobby;
    }
}
