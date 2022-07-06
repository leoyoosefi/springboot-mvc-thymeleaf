package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class NewReleasesController {
    @GetMapping("/new-releases")
    public String newReleases(Model model){
        LocalDate currentDate = LocalDate.now();
        model.addAttribute("serverDate", currentDate);
        return "new-releases";
    }
}
