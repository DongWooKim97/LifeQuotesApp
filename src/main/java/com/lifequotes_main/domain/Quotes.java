package com.lifequotes_main.domain;

public class Quotes {
    private int id;
    private String quote;
    private String author;

    public Quotes(int id, String quote, String author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}
