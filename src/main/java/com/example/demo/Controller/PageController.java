package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    //This would override index.html
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
