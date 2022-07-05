package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewReleasesController {
    @GetMapping("/new-releases")
    public String newReleases(){
        return "new-releases";
    }
}
