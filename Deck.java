/*
 * Sam Polyakov
 * Deck.java
 * 02/12/2023
 * Project 1
 * CS231 B
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    Random rand = new Random();

    /**
     * Creates the underlying deck as an ArrayList of Card objects. 
     * Calls build() as a subroutine to build the deck itself.
     */

    public Deck() {
        deck = new ArrayList<Card>();
        this.build();
    }

    /**
     * Builds the underlying deck as a standard 52 card deck. 
     * Replaces any current deck stored. 
     */
    public void build() {
        deck.clear();
        int[] commonCard = {2,3,4,5,6,7,8,9,11};
            for (int i : commonCard){
                Card card = new Card(i);
                for(int j = 0; j<4; j++){
                    deck.add(card);
                }
            }

        Card card = new Card(10);
        for(int j = 0; j<16;j++){
            deck.add(card);
        }

    }

    /**
     * Returns the number of cards left in the deck. 
     * @return the number of cards left in the deck
     */
    public int size() {
        return deck.size();
    }

    /**
     * Returns and removes the first card of the deck.
     * @return the first card of the deck
     */
    public Card deal() {
        return deck.remove(0);
    }

    /**
     * Shuffles the cards currently in the deck. 
     */
    public void shuffle() {
        ArrayList<Card> shuffled = new ArrayList<Card>();
        for(int i = 0; i<52;i++){
            int randCard = rand.nextInt(deck.size());
            Card val = deck.remove(randCard);
            shuffled.add(val);
        }
        deck = shuffled;

    }

    /**
     * Returns a string representation of the deck.
     * @return a string representation of the deck
     */
    public String toString() {
       String cardDeck = "[";
       for (Card c : deck){
            cardDeck += c.toString() + " ";
       }
       cardDeck += "]";
       return cardDeck;
    }
}
