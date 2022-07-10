package com.example.gfnlibraryv2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GamesController {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GameRepository repo;

    @GetMapping("/games")
    public @ResponseBody Iterable<Game> index(){
        return repo.findAll();
    }

    @GetMapping("/test")
    public Game test() {
        Game game = new Game.Builder(counter.incrementAndGet())
                            .title("TestGame")
                            .build();
        return game;
    }
     
}
