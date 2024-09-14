package com.example.cards;

public interface Deck {

    void shuffle();

    void cut(int index);

    Card deal();

    Card flip();

    int find(Card card);

    void newOrder(Deck cards);

    int size();

}
