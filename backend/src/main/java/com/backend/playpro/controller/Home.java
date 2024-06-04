package com.backend.playpro.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
public class Home {
    @RequestMapping({"","/","home"})
    @ResponseBody
    public String home()
    {
        return "Hello World";
    }

    @GetMapping(value = "about", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String about(){

        return "{ \"message\":\"In about section\" }";
    }

    @RequestMapping(value = "contact", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String contact(){
        return "{ \"message\":\"In Contacts\" }";
    }
}
