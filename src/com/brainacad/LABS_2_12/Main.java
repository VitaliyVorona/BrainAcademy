package com.brainacad.LABS_2_12;

import com.brainacad.LABS_2_12.labs_2_12_3.Card;

/**
 * Created by User on 09.09.2015.
 */
public class Main {
    public static void main(String[] args) {

        Card[] cards = new Card[52];
        int counter = 0;
        for (Suit i : Suit.values()){

            for (Rank j : Rank.values()){
                Card card = new Card(i, j);
                cards[counter] = card;
                counter++;
            }
        }

        for (Card i : cards){
            System.out.println(i + "  " );
        }
    }

    public enum MyDayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public MyDayOfWeek nextDay() {
            int currentDay = this.ordinal();
            if (this == SATURDAY) {
                return SUNDAY;
            } else return MyDayOfWeek.values()[++currentDay];
        }
    }

    public enum Suit {
        SPADE, DIAMOND, CLUB, HEART;
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
}
