package com.practice.designpattern;

public class NewsAgencyObserverMain {
    static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel newsChannel1 = new NewsChannel("news 123");
        NewsChannel newsChannel2 = new NewsChannel("news checking");
        NewsChannel newsChannel3 = new NewsChannel("news displaying");

        newsAgency.registerObserver(newsChannel1);
        newsAgency.registerObserver(newsChannel2);
        newsAgency.registerObserver(newsChannel3);

        newsAgency.setNews("Added or registered channel!");


        newsAgency.removeObserver(newsChannel1);

        newsAgency.setNews("Removed channel!");
    }
}
