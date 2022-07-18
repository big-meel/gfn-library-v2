package com.example.gfnlibraryv2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Indicates that object is a JPA Entity */
@Entity
@Table(name = "games")
public class Game {
    /* 
        JPA will recognise id as the Object's id
    */ 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String sortName;
    private boolean isFullyOptimized;
    private String steamUrl;
    private String publisher;
    private String status;
    private String store;
    private String genres; //this may need to be changed to a List or Array of Strings
    private String imageUrl;

    /* exists solely for the sake of JPA */
    protected Game() {}

    // Implement Builder pattern
    public static class Builder {
        // required
        private final Long id;
        
        private String title = null;
        private String sortName = null;
        private boolean isFullyOptimized = false;
        private String steamUrl = null;
        private String publisher =  null;
        private String status = null;
        private String store = null;
        private String genres = null;
        private String imageUrl =  null;
        
        public Builder(Long value) {
            this.id = value;
        }
        
        public Builder title(String value) {
            title = value;
            return this;
        }

        public Builder sortName(String value) {
            sortName = value;
            return this;
        }
        
        public Builder isFullyOptimized(boolean value) {
            isFullyOptimized = value;
            return this;
        }

        public Builder steamUrl(String value) {
            steamUrl = value;
            return this;
        }

        public Builder publisher(String value) {
            publisher = value;
            return this;
        }

        public Builder status(String value) {
            status = value;
            return this;
        }

        public Builder store(String value) {
            store = value;
            return this;
        }

        public Builder genres(String value) {
            genres = value;
            return this;
        }

        public Builder imageUrl(String value) {
            imageUrl = value;
            return this;
        }

        public Game build() {
            return new Game(this);
        }

    }

    private Game(Builder builder) {
        id = builder.id;
        title = builder.title;
        sortName = builder.sortName;
        isFullyOptimized = builder.isFullyOptimized;
        steamUrl = builder.steamUrl;
        publisher = builder.publisher;
        status = builder.status;
        store = builder.store;
        genres = builder.genres;
        imageUrl = builder.imageUrl;        
    }

    @Override
    public String toString() {
        return String.format(
            "Game: Title %s, ID %d",
            title, id
        );
    }
    
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public String getSortName() {
        return sortName;
    }
    
    public boolean getOptimization() {
        return isFullyOptimized;
    }
    
    public String getSteamUrl() {
        return steamUrl;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getStore() {
        return store;
    }
    
    public String getGenres() {
        return genres;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
}
