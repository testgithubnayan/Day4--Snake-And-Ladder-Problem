package com.bridgelabz;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_Position = 100;

    public static void main(String[] args) {
        int player1Position = 0;
        int player2Position=0;
        int diceCount=0;
        System.out.println("Game begins: player1 & player2 at position: " + player1Position+ "  "+player2Position);
        while (player1Position<WINNING_Position && player2Position<WINNING_Position) {
            int player1Dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int opt1 = (int) Math.floor(Math.random() * 10) % 3;
            diceCount++;
            switch (opt1) {
                case NO_PLAY:
                    System.out.println("Player1 stays in same position: " + player1Position);
                    break;
                case LADDER:
                    player1Position = player1Position + player1Dice;
                    if(player1Position>WINNING_Position) {
                        player1Position=player1Position-player1Dice;
                        break;
                    }
                    System.out.println("Ladder " + player1Dice + " Player1 position: " + player1Position);
                    break;
                case SNAKE:
                    player1Position = player1Position - player1Dice;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                    System.out.println("Snake "+player1Dice+" Player1 position: " + player1Position);
                    break;
            }

            int player2Dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int opt2 = (int) Math.floor(Math.random() * 10) % 3;
            diceCount++;
            switch (opt2) {
                case NO_PLAY:
                    System.out.println("Player2 stays in same position: " + player2Position);
                    break;
                case LADDER:
                    player2Position = player2Position + player2Dice;
                    if(player2Position>WINNING_Position) {
                        player2Position=player2Position-player2Dice;
                        break;
                    }
                    System.out.println("Ladder " + player2Dice + " Player2 position: " + player2Position);
                    break;
                case SNAKE:
                    player2Position = player2Position - player2Dice;
                    if (player2Position < 0) {
                        player2Position = 0;
                    }
                    System.out.println("Snake "+player2Dice+" Player2 position: " + player2Position);
                    break;
            }
        }
        System.out.println("Player1 final position "+player1Position);
        System.out.println("Player2 final position "+player2Position);

        System.out.println(player1Position>player2Position?"Player1 Won":"Player2 won");

        System.out.println("Total number of times dice rolled: "+diceCount);
    }
}
