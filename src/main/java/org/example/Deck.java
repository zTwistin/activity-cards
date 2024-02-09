package org.example;

public interface Deck {

    void cut(int index);
    Card deal();
    void newOrder(Deck cards);
    int search(int card);
    void shuffle();
    int size();
    Card turnOver();

}
