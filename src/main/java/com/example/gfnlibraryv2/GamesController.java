package com.example.gfnlibraryv2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GamesController {

    @Autowired
    private GameRepository repo;

    @GetMapping("/")
    public String index(){
        for (Game game : repo.findAll()) {
            return String.format("%s", game.toString());
        }
        return "End";
    }
     
}
