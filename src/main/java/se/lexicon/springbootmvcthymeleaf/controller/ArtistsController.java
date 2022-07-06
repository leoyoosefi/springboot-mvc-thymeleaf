package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class ArtistsController {
@GetMapping("/artists")
    public String artists(Model model){
    LocalDate currentDate = LocalDate.now();
    model.addAttribute("serverDate",currentDate);
        return "artists";

    }
}
