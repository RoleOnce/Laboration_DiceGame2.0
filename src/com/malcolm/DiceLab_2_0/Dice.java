package com.malcolm.DiceLab_2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {

    static List<Integer> playersScore;

    public void dice(int numOfDie, int numOfPlayers) {

        // ---> COLORS <---
        String gron = "\u001B[32m";
        String farg = "\u001B[0m";
        String yel = "\u001B[33m";
        String low = "\u001B[0m";
        String ljus = "\u001B[94m";
        String bla = "\u001B[0m";

        Random random = new Random();
        playersScore = new ArrayList<>();

                ; // NEED A FIX

        for (int i = 0; i < numOfPlayers; i++) {
            playersScore.add(i);
        }

        int playerSum = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println(yel + "Spelare: ---> " + (i + 1) + " <---" + low);

            playerSum = 0;

            for (int j = 0; j < numOfDie; j++) {
                int kast = random.nextInt(6) + 1;
                playerSum += kast;

                System.out.println("Du fick: " + kast);
            }
            System.out.println("Ditt resultat är: " + gron + playerSum + farg + "\n");
            playersScore.set(i, playerSum);

        }

        int maxScore = Integer.MIN_VALUE;
        int winnerIndex = -1;

        for (int i = 0; i < playersScore.size(); i++) {
            if (playersScore.get(i) > maxScore){
                maxScore = playersScore.get(i);
                winnerIndex = i;
            }
        }

        System.out.println(ljus + "Vinnaren är " + bla + yel + "Spelare " + (winnerIndex + 1) + low + ljus +
                ", med slutliga poängen " + bla + yel + maxScore + low + ljus + "." + bla);

    }

}
