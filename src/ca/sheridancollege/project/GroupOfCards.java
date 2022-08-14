
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * Author: Sakshat
 * Date: 13 August 2022
 */

package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;


public class GroupOfCards extends Game {

    public GroupOfCards(String name) {
        // super(name);
    }

    public GroupOfCards() {
    }

    private ArrayList<Cards> cards;
    static ArrayList<Cards> deck = new ArrayList<>();
    static LinkedList<Cards> newDeck1 = new LinkedList<>(); // player 1 deck
    static LinkedList<Cards> newDeck2 = new LinkedList<>(); // player 2 deck
    
    Cards playerOneTopCard; 
    Cards playerTwoTopCard;

    String winner = "";

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Cards> getCards() {
        return cards;
    }

    // method that suffles both players decks
    public void shuffle() {
        Collections.shuffle(newDeck1);
        Collections.shuffle(newDeck2);
    }


    @Override
    public void play() {
        // getting the top card from each player's deck
        playerOneTopCard = newDeck1.get(0);
        playerTwoTopCard = newDeck2.get(0);

        // comparing values of each top card
        int comparable = playerOneTopCard.cardsValCompare(playerTwoTopCard);

        if (comparable == 1) {
            // removing the top card from player 1 deck

            newDeck1.pop();
            // adding the removed card to the deck of another player's
            newDeck2.addLast(playerOneTopCard);
            // player 2 wins both the top cards
            winner = players.get(1) + " wins!";

        }
        // when player 1 wins the top cards
        else if (comparable == -1) {

            newDeck2.pop();
            newDeck1.addLast(playerTwoTopCard);
            winner = players.get(0) + " wins!";

        }
        // when cards of player 1 are less than 4
        else if (newDeck1.size() < 4 && comparable == 0) {

            System.out.printf("%s is the winner!! %10s's cards are 52 %10s's cards are 0", players.get(1),
                    players.get(1), players.get(0));

        }
        // when player 2 has cards less than 4
        else if (newDeck2.size() < 4 && comparable == 0) {

            System.out.printf("%s is the winner!! %10s's cards are 52 %10s's cards are 0", players.get(0),
                    players.get(0), players.get(1));

        }
        // when war begins(both top cards values are same)
        else { // draw condition(war begins)
            comparable = newDeck1.get(1).cardsValCompare(newDeck2.get(1));
            if (comparable == -1 && newDeck2.size() > 4) {
                newDeck2.pop();
                newDeck1.addLast(playerOneTopCard);
                newDeck2.remove(1);
                newDeck1.addLast(newDeck1.get(1));
                newDeck2.remove(2);
                newDeck1.addLast(newDeck1.get(2));
                newDeck2.remove(3);
                // adding removed cards to player two's deck
                newDeck1.addLast(newDeck1.get(3));
                winner = "Draw(WAR BEGINS) " + players.get(0) + " wins!";
            } else if (comparable == 1 && newDeck1.size() > 4) {
                newDeck1.pop();
                newDeck2.addLast(playerOneTopCard);
                newDeck1.remove(1);
                newDeck2.addLast(newDeck1.get(1));
                newDeck1.remove(2);
                newDeck2.addLast(newDeck1.get(2));
                newDeck1.remove(3);
                // adding removed cards to player two's deck
                newDeck2.addLast(newDeck1.get(3));
                winner = "Draw(WAR BEGINS) " + players.get(1) + " wins!";
            }
        }
    }

    @Override
    public void declareWinner() {
        System.out.printf("%s's cards: %d %10s's cards: %d %n %s wins the cards%n-----------------------------------%n",
                players.get(0), newDeck1.size(),
                players.get(1), newDeck2.size(), winner);
        // condition for actuall game winner when player 1 has all 52 cards
        if (newDeck1.size() == 52) {

            System.out.println(players.get(0) + " is the WINNER!!");
        } 
        // or if player 2 has all 52 cards
        else if (newDeck2.size() == 52) {

            System.out.println(players.get(1) + " is the WINNER!!");
        }

    }

}// end class

