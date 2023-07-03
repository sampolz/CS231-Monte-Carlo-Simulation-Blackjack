/*
file name:      BlackjackTests.java
Authors:        Max Bender & Naser Al Madi & Sam Polyakov
last modified:  2/12/2023

How to run:     java -ea BlackjackTests
*/


public class BlackjackTests {

    public static void blackjackTests() {

        // case 1: testing Blackjack() and Blackjack(i)
        {
            // set up
            Blackjack bj1 = new Blackjack();
            Blackjack bj2 = new Blackjack(5);

            // verify
            System.out.println(bj1.game(false));
            System.out.println(bj2.game(false));

            // test
            assert bj1 != null : "Error in Blackjack::Blackjack()";
            assert bj2 != null : "Error in Blackjack::Blackjack()";
        }

        // case 2: testing toString() 
        {
            // set up
            Blackjack b1 = new Blackjack();
            
            // verify
            
            // test
            // pattern should be:
            // Player Hand: [] : 0    
            // Dealer Hand: [] : 0
            System.out.println(b1.toString());
        }    


       
        System.out.println("*** Done testing Blackjack! ***\n");
    }


    public static void main(String[] args) {

        blackjackTests();
    }
}