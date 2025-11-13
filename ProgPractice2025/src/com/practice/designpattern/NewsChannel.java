package com.practice.designpattern;

public class NewsChannel implements Observer{

    private String name;
    private String latestNews;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
         this.latestNews = news;
         display();
    }

    private void display() {
        System.out.println("Latest news: " + latestNews);
    }
}
