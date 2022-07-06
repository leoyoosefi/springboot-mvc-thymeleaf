package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/index")
    public String index(){
        System.out.println("##### index method has been executed ####");
        return "index";
    }


    @GetMapping("/home")
    public String home(){
        System.out.println("##### home method has been executed ####");
        return "index";
    }

}
