package com.practice.designpattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    List<Observer> observerList = new ArrayList<>();
    String news = "example news";

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer obs : observerList) {
            obs.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObserver();
    }
}
