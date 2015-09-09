package com.brainacad.LABS_2_12;

/**
 * Created by User on 09.09.2015.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(MyDayOfWeek.SATURDAY.nextDay());
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
            int day = this.ordinal();
            if (this == SATURDAY) {
                return SUNDAY;
            } else return MyDayOfWeek.values()[++day];
        }
    }

    public enum Suit {
        SPADE, DIAMOND, CLUB, HEART;
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
}
