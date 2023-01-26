package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick 
{
    
    public static void main(String[] args) 
    {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i]=card;
            System.out.println(hand[i].getSuit() + hand[i].getValue());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your card value(1 to 13): ");
        int value = input.nextInt();
        System.out.println("Please enter your suit value: ");
        String suit = input.next();

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        // If the guess is successful, invoke the printInfo() method below.
        for(int i=0; i<hand.length; i++) 
        {
            if (value == hand[i].getValue() && suit.equalsIgnoreCase(hand[i].getSuit())) 
            {
                printInfo();
            } 
        }
    }


    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Yesha Patel, but you can call me Yesha");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println("-- Have a good financial stability.");	

        System.out.println("My hobbies:");
        System.out.println("-- Dancing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Travelling");

        System.out.println();
        
    }

}
