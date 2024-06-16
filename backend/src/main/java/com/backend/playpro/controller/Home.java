package com.backend.playpro.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping({"","/","home"})
    public String home()
    {
        return "Hello World";
    }

    @GetMapping(value = "about", produces = MediaType.APPLICATION_JSON_VALUE)
    public String about(){

        return "{ \"message\":\"In about section\" }";
    }

    @GetMapping(value = "contact", produces = MediaType.APPLICATION_JSON_VALUE)
    public String contact(){
        return "{ \"message\":\"In Contacts\" }";
    }
}
