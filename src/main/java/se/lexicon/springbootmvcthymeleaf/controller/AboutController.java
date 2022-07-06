package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String about(Model model){
        System.out.println("not a test");
        LocalDate currentDate = LocalDate.now();
        model.addAttribute("serverDate", currentDate);
        return "about";
    }

}
