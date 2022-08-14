/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * Author: Sakshat
 * Date: 13 August 2022
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;


public abstract class Game {

    private final String name = "";// the title of the game
    static ArrayList<String> players = new ArrayList<>();// the players of the game

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<String> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<String> players) {
        Game.players = players;
    }

    // method that gets players names
    public static String names(String name, Scanner in) {
        System.out.println(name);
        String playerName = in.nextLine();
        players.add(playerName);
        return playerName;
    }


    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

}// end class
