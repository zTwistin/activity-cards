package org.example;

public class DeckDriver {

    public static void main(String[] args) {
        
        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
        displayDeck(cards);
        System.out.println(cards.size());

        cards.cut(0);
        displayDeck(cards);
        System.out.println(cards.size());
    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }
}
