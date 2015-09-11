package com.brainacad.LABS_2_12.labs_2_12_3;

import com.brainacad.LABS_2_12.Main;

/**
 * Created by User on 09.09.2015.
 */
public class Card {
    private Main.Suit cardSuit;
    private Main.Rank cardRank;

    public Card(Main.Suit cardSuit, Main.Rank cardRank) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return this.cardSuit + " " + this.cardRank;
    }
}
