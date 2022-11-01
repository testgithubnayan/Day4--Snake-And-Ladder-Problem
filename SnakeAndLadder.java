package com.bridgelabz;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        int player1Position = 0;
        System.out.println("player1 at position: " + player1Position);
        int player1Dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("Dice rolled value: " + player1Dice);

        int option = (int) Math.floor(Math.random() * 10) % 3;
        switch (option) {
            case NO_PLAY:
                System.out.println("Player1 stays in same position: " + player1Position);
                break;
            case LADDER:
                player1Position = player1Position + player1Dice;
                System.out.println("Player1 moves ahead by: " + player1Position);
                break;
            case SNAKE:
                player1Position = player1Position - player1Dice;
                if (player1Position < 0) {
                    player1Position = 0;
                }
                System.out.println("Player1 moves back: " + player1Position);
                break;
        }
    }
}
