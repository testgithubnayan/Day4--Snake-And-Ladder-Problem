package com.bridgelabz;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int player1Position = 0;
        System.out.println("player1 at position: " + player1Position);
        int player1Dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("Dice rolled value: " + player1Dice);
    }
}
