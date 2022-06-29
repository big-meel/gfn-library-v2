package com.example.gfnlibraryv2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GamesController {

    @GetMapping("/")
    public String index(){
        return "Games will be listed here";
    }
     
}
