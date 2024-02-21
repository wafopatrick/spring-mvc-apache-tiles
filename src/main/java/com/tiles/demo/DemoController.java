package com.tiles.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

    @GetMapping("/home")
    public String home(){
        return "site.home";
    }

    @GetMapping("/greet/{name}")
    public ModelAndView greet(@PathVariable("name") String name){
        return new ModelAndView("site.greeting", "name", name);
    }


}
