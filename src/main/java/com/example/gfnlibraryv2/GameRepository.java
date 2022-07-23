package com.example.gfnlibraryv2;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long>{
    List<Game> findByTitle(String title);
    List<Game> findByTitleContainingIgnoreCase(String title);
    Game findById(long id);
}
