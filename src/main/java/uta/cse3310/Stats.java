package uta.cse3310;
public class Stats{
    int gamesWonByX;
    int gamesWonByO;
    int gamesDrawn;
    int gamesPlayed;
    int gamesInProgress;

    //function to print stats, returns a string
    public String printStats(){
        return "Games Played: " + gamesPlayed + 
        "\nGames In Progress: " + gamesInProgress + 
        "\nGames Won By X: " + gamesWonByX + 
        "\nGames Won By O: " + gamesWonByO + 
        "\nGames Drawn: " + gamesDrawn;
    }
    
}