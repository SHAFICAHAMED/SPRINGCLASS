package com.example.greeting.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    public  String home(Model mod)
    {

        return  "index";
    }
    @PostMapping("/greet")
    public  String gre(@RequestParam("name") String name,Model mod)
    {
        mod.addAttribute("name",name);
        return "greeting";
    }


}
