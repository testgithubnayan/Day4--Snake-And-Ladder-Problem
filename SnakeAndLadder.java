package com.bridgelabz;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_Position = 100;

    public static void main(String[] args) {
        int player1Position = 0;
        System.out.println("player1 at position: " + player1Position);
        while (player1Position < WINNING_Position) {
            int player1Dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int option = (int) Math.floor(Math.random() * 10) % 3;
            switch (option) {
                case NO_PLAY:
                    System.out.println("Player1 stays in same position: " + player1Position);
                    break;
                case LADDER:
                    player1Position = player1Position + player1Dice;
                    if (player1Position > WINNING_Position) {
                        player1Position = player1Position - player1Dice;
                        break;
                    }
                    System.out.println("Ladder " + player1Dice + " Player1 position: " + player1Position);
                    break;
                case SNAKE:
                    player1Position = player1Position - player1Dice;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                    System.out.println("Snake " + player1Dice + " Player1 position: " + player1Position);
                    break;
            }
        }
        System.out.println("Player1 won: " + player1Position);
    }
}
