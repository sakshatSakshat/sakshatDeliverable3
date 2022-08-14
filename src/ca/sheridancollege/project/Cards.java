/* 
 * Author: Sakshat
 * Date: 13 August 2022
 */

package ca.sheridancollege.project;
import java.util.ArrayList;


public class Cards {
    public enum Suit {
        HEART, DIAMOND, SPADE, CLUB
    }
    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING,
    }
    public Suit suit;
    public Value value;
    public int rank;
    public static ArrayList<Cards> cardsDeck = new ArrayList<Cards>();

    // constructor for cards
    public Cards(Suit suit, Value value, int rank) {
        this.suit = suit;
        this.value = value;
        this.rank = rank;
    }
    public Cards() {
    }
    // creating a stack of cards(deck)
    static ArrayList<Cards> createStack() {
        for (int i = 1; i < 14; i++) {
            switch (i) {
                case 1:
                    for (Value value : Value.values()
                    ) {
                        cardsDeck.add(new Cards(Suit.HEART, value, i++));
                    }
                    i = 1;
                case 14:
                    for (Value value : Value.values()
                    ) {
                        cardsDeck.add(new Cards(Suit.DIAMOND, value, i++));
                    }
                    i = 1;
                case 27:
                    for (Value value : Value.values()
                    ) {
                        cardsDeck.add(new Cards(Suit.CLUB, value, i++));
                    }
                    i = 1;
                case 40:
                    for (Value value : Value.values()
                    ) {
                        cardsDeck.add(new Cards(Suit.SPADE, value, i++));
                    }
                    i = 1;

            }

        } return cardsDeck;

    }

    


    @Override
    public String toString() {
        return value + " of " + suit;
    }
    // method that compares the value(number) of top cards
    public int cardsValCompare(Cards cardRank) {
    if (this.rank > cardRank.rank) {
        return -1;
    } if (this.rank < cardRank.rank){
        return 1;
    } else {
        return 0;
        }
    }

    
}
