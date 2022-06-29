package com.example.gfnlibraryv2;

public class Game {
    /* 
        Add JPA functionality for Games
    */ 
    private final long id;
    private final String title;
    private final String sortName;
    private final boolean fullyOptimized;
    private final String steamUrl;
    private final String publisher;
    private final String status;
    private final String store;
    private final String genres;
    private final String imageUrl;
    
    public Game(long id, String title, String sortName, boolean fullyOptimized, String steamUrl, 
    String publisher, String status, String store, String genres, String imageUrl) {
        this.id = id;
        this.title = title;
        this.sortName = sortName;
        this.fullyOptimized = fullyOptimized;
        this.steamUrl = steamUrl;
        this.publisher = publisher;
        this.status = status;
        this.store = store;
        this.genres = genres;
        this.imageUrl = imageUrl;
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
        return fullyOptimized;
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
