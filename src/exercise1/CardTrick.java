package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1); // Random number between 1 and 13
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random number between 0 and 3
            hand[i] = card;
        }

        // Ask the user for a card
        System.out.println("Pick a card!");
        System.out.println("Enter a value (1-13, where 11=Jack, 12=Queen, 13=King): ");
        int value = scanner.nextInt();
        System.out.println("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = scanner.nextInt();
        String suit = Card.SUITS[suitIndex];
        
        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        // Search for the card in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not found.");
        }
        
        scanner.close();
    }

    private static void printInfo() {
        // printInfo method content remains the same
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        // And so on...
    }
}
