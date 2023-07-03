/*
 * Sam Polyakov
 * Blackjack.java
 * 02/12/2023
 * Project 1
 * CS231 B
 */

public class Blackjack {
    private Hand dealer;
    private Hand player;
    private Deck deck;
    private int res;

    public Blackjack(int reshuffleCutoff){
        dealer = new Hand();
        player = new Hand();
        deck = new Deck();

        res = reshuffleCutoff;
        deck.shuffle();
        this.reset();
    }

    public Blackjack(){
        this(13);
    }

    public void reset(){
        dealer.reset();
        player.reset();
        if(deck.size() <= res){
            deck.build();
            deck.shuffle();
        }
    }

    public void deal(){
        for(int i=0; i<2; i++){
            player.add(deck.deal());
        }
        for(int i=0; i<2; i++){
            dealer.add(deck.deal());
        }
    }

    public boolean playerTurn(){
        while (player.getTotalValue()<=16){
            player.add(deck.deal());
        }
        return player.getTotalValue()<=21;
    }

    public boolean dealerTurn(){
        while (dealer.getTotalValue()<=16){
            dealer.add(deck.deal());
        }
        return dealer.getTotalValue()<=21;

    }

    public void setReshuffleCutoff(int cutoff){
        res = cutoff;
    }

    public int getReshuffleCutoff(){
        return res;
    }

    public String toString(){
        String playerOutput = "[";
        for(int i=0; i<player.size(); i++){
            playerOutput+=player.getCard(i);
            if(i<player.size()-1){
                playerOutput+=", ";
            }
        }
        playerOutput += "]";

        String dealerOutput = "[";
        for(int i=0; i<dealer.size(); i++){
            dealerOutput+=dealer.getCard(i);
            if(i<dealer.size()-1){
                dealerOutput+=", ";
            }
        }
        dealerOutput += "]";

        return("Player hand: "+playerOutput+" = "+player.getTotalValue()+"\n"
        +"Dealer hand: "+dealerOutput+" = "+dealer.getTotalValue());

    }

//    public playerTurnInteractive()


    public int game(boolean verbose){
        reset();
        deal();
        playerTurn();
        dealerTurn();

        int score = 0;

        if(dealerTurn()==true && playerTurn()==false){
            score = -1;
        }
        else if(dealerTurn()==false && playerTurn()==true){
            score = 1;
        }
        else if(dealerTurn()==true && playerTurn() ==true){
            if(player.getTotalValue()>dealer.getTotalValue()){
                score = 1;
            }
            if(player.getTotalValue()<dealer.getTotalValue()){
                score = -1;
            }
            if(player.getTotalValue()==dealer.getTotalValue()){
                if(player.getTotalValue()==21){
                    if(player.size() == 2 && dealer.size()>=3){
                        score = 1;
                    }
                    else if(dealer.size() == 2 && player.size()>=3){
                        score = -1;
                    }
                    else{
                        score = 0;
                    }
                }
            }
        
        }
        if(verbose == true){
            System.out.println(toString());
            if(score==1){
                System.out.println("Player has won the game.");
            }
            else if(score==-1){
                System.out.println("Dealer has won the game.");
            }
            else if(score==0){
                System.out.println("The game is a draw.");
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Blackjack bj = new Blackjack();
        bj.reset();
        bj.deal();
        bj.playerTurn();
        bj.dealerTurn();
        bj.setReshuffleCutoff(13);
        bj.getReshuffleCutoff();

        bj.toString();
        // bj.game(false);
        System.out.println(bj.game(true));
    }

}
