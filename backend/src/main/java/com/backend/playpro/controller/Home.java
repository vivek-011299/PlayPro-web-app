package com.backend.playpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @RequestMapping({"","/","home"})
    @ResponseBody
    public String home()
    {
        return "Hello World";
    }

    @RequestMapping("about")
    @ResponseBody
    public String about(){
        return "In the about section";
    }

    @RequestMapping("contact")
    @ResponseBody
    public String contact(){
        return "contact us";
    }
}
