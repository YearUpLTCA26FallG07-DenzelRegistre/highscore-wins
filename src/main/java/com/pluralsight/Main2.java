package com.pluralsight;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Example: Home:Visitor|21:9");
        System.out.println("Please enter the team and the game score: ");
        String theGame = scanner.nextLine();

        int pipePosition = theGame.indexOf("|");
        int colonPosition = theGame.indexOf(":");



        String teamsPlaying =theGame.substring(0, pipePosition);
        String firstTeam = teamsPlaying.substring(0,colonPosition);
        String secondTeam = teamsPlaying.substring(colonPosition + 1);

        String teamsPoints = theGame.substring(pipePosition +1);
        colonPosition = teamsPoints.indexOf(":");

        String firstTeamScore = teamsPoints.substring(0, colonPosition);
        String secondTeamScore = teamsPoints.substring(colonPosition + 1);


        //NAP is Name and Points
        String firstTeamNAP = firstTeam + " " + firstTeamScore;
        String secondTeamNAP = secondTeam + " " + secondTeamScore;

        int intFirstTeamScore = Integer.parseInt(firstTeamScore);
        int intSecondTeamScore = Integer.parseInt(secondTeamScore);



        if (intFirstTeamScore > intSecondTeamScore ) {
            System.out.println("Winner: " + firstTeamNAP);
        } else if (intSecondTeamScore > intFirstTeamScore) {
            System.out.println("Winner: " + secondTeamNAP);
        }else
            System.out.println("TIE!: " + firstTeamNAP + " " + secondTeamNAP);

        scanner.close();
    }
}

