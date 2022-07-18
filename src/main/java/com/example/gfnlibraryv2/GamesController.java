package com.example.gfnlibraryv2;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamesController {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GameRepository repo;

    @GetMapping("/games")
    public @ResponseBody Iterable<Game> index(){
        return repo.findAll();
    }

    @GetMapping("/games/{id}")
    public @ResponseBody Game find(@PathVariable(value="id") String id) {
        Long parsed_id = Long.parseLong(id);
        Game game = repo.findById(parsed_id).get();
        return game;
    }

    @GetMapping("/test")
    public Game test() {
        Game game = new Game.Builder(counter.incrementAndGet())
                            .title("TestGame")
                            .build();
        return game;
    }
     
}
