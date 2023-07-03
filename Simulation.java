/*
 * Sam Polyakov
 * Simulation.java
 * 02/12/2023
 * Project 1
 * CS231 B
 */

public class Simulation {
    public static void main(String[] args) {
        int playerCount = 0;
        int dealerCount = 0;
        int pushCount = 0;
        int gameCount = 1000;
        

        Blackjack b1 = new Blackjack();
        for(int i=0;i<gameCount;i++){
            int result = b1.game(false);

            if(result == -1){
                dealerCount++;
            }

            else if(result == 0){
                pushCount++;
            }

            else if(result == 1){
                playerCount++;
            }
        }

        System.out.println("Dealer total wins: " + dealerCount);
        System.out.println("Player total wins: " + playerCount);
        System.out.println("Push total: " + pushCount);

        System.out.println("Dealer win percentage: " + (dealerCount*100.0/gameCount) + "%");
        System.out.println("Player win percentage: " + (playerCount*100.0/gameCount) + "%");
        System.out.println("Push percentage: " + (pushCount*100.0/gameCount) + "%");
    }
}
