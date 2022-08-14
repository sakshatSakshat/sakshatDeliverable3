///* 
// * Author: sakshat
// * Date: 13 August 2022
// */
//
//package ca.sheridancollege.project;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        boolean ok = Junit.test(5, 3);
//        System.out.println("valid" + ok);
//        Scanner input = new Scanner(System.in);
//        GroupOfCards grpOfCrds = new GroupOfCards();
//        // Cards crd = new Cards();
//        // cards in the card deck
//        GroupOfCards.deck = Cards.createStack();
//        // deviding deck in half for 2 players
//        GroupOfCards.newDeck1.addAll( GroupOfCards.deck.subList(0, 26));
//        GroupOfCards.newDeck2.addAll( GroupOfCards.deck.subList(26,  GroupOfCards.deck.size()));
//        GroupOfCardas.shuffle();
//        Game.names("Enter player 1 name: ", input);
//        Game.names("Enter player 2 name: ", input);
//        grpOfCrds.play();
//        grpOfCrds.declareWinner();
//       
//        System.out.println("Flip card: 1 for yes or 0 for No");
//        int yN = input.nextInt();
//        while (yN == 1) {
//            grpOfCrds.play();
//            grpOfCrds.declareWinner();
//            System.out.println("Flip card: 1 for yes or 0 for No");
//            int again = input.nextInt();
//
//            if ( GroupOfCards.newDeck1.size() == 0 && again == 1||  GroupOfCards.newDeck2.size() == 0 && again == 1) {
//                break;
//            }
//            else if (again == 1) {
//                
//                grpOfCrds.play();
//                grpOfCrds.declareWinner();
//                
//            }
//        
//
//            else {
//                break;
//            }
//        }
//        
//
//    }
//}
