/*
 * Sam Polyakov
 * Card.java
 * 02/12/2023
 * Project 1
 * CS231 B
 */


public class Card {
    /**
     * The value of the card.
     */
    private int value;

    /**
     * Constructs a card with the specified value.
     * @param val
     */
    public Card(int val) {
        // TBD
        if(val >= 1 && val <= 11){
            value = val;
        }
        // if(val == 11){
        //     if()
        // }
        else{
            value = 0;
        }
    }

    /**
     * Returns the value of the card.
     * @return the value of the card
     */
    public int getValue() {
        // TBD
        return value;
    }
    
    /**
     * Returns a string representation of this card.
     * @return a string representation of this card
     */
    public String toString() {
        // TBD
       String cardValue = "";
       cardValue += getValue();
       return cardValue;
    }

    
}