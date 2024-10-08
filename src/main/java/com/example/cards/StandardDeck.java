package com.example.cards;

import java.util.*;

public class StandardDeck implements Deck {

    private List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();
        Arrays.stream(Suit.values()).forEach(suit -> {

            Arrays.stream(FaceValue.values()).map(faceValue -> new Card(suit, faceValue)).forEach(newDeck::add);

        });
        return newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards, new Random(System.nanoTime()));
    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card flip() {
        return null;
    }

    @Override
    public int find(Card card) {
        return 0;
    }

    @Override
    public void newOrder(Deck cards) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "StandardDeck{" + cards + '}';
    }
}
