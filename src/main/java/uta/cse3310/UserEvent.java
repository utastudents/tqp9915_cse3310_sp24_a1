package uta.cse3310;
// User events are sent from the webpage to the server

public class UserEvent {
    int GameId; // the game ID on the server
    PlayerType PlayerIdx; // either an XPLAYER or an OPLAYER
    int Button; // button number from 0 to 8
}
