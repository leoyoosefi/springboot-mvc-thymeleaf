package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtistsController {
@GetMapping("/artists")
    public String artists(){
        return "artists";

    }
}
