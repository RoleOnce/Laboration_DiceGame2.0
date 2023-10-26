package com.malcolm.DiceLab_2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameFlow {


    int numOfDie;
    public int numOfPlayers;

    public void gameFlow() {

        // ---> COLORS <---
        String rod = "\u001b[31m";
        String farg = "\u001b[0m";
        String ljus = "\u001B[94m";
        String bla = "\u001B[0m";
        String yel = "\u001B[33m";
        String low = "\u001B[0m";

        // ---> INSTANTIATION <---
        Scanner sc = new Scanner(System.in);
        List<String> nameList = new ArrayList<>();

        // FRÅGAR OM HUR MÅNGA TÄRNINGAR SOM SKA VARA MED I SPELET
        // SPARA NER VÄRDET I EN INT-VARIABEL
        System.out.println("Välkommen till världens bästa tärningsspel!");
        System.out.println("Hur många tärningar ska kastas");
        numOfDie = sc.nextInt();
        sc.nextLine();

        // FRÅGAR HUR MÅNGA SPELARE SOM SKA VARA MED
        // SPARA NER VÄRDET I EN INT-VARIABEL
        while (numOfPlayers < 2) {
            System.out.println("Hur många ska delta i spelet? (Minst 2 spelare) ");
            numOfPlayers = sc.nextInt();
            sc.nextLine();


            if (numOfPlayers < 2) {
                System.out.println(rod + "ÄR DU BLIND!!? LÄS INSTRUKTIONERNA!\n" + farg);
            }
        }

        System.out.println("\nHärligt att ni vill va med och spela..!");
        System.out.println("Skriv in era namn:\n");

        String playerName;

        for (int i = 0; i < numOfPlayers; i++) {

            System.out.println( yel + "Spelare " + (i + 1) + low );
            playerName = sc.nextLine();
            nameList.add(playerName);
        }

        System.out.println("\nDeltagarna är: ");
        for (String namn : nameList) {
            System.out.println(yel + "->>> " + low + ljus + namn + bla + yel + " <<<-" + low);
        }

        System.out.println("Tryck på " + ljus + "ENTER " + bla + "för att börja kasta!");
        sc.nextLine();

        Dice dice = new Dice();
        dice.dice(numOfDie, numOfPlayers);

    }




}
