package com.letscode.game.entities.player;

import com.letscode.game.entities.Board;

import java.util.ArrayList;

public class Player {

    Board playerBoard = new Board();
    ArrayList<String> plays = new ArrayList<>();
    ArrayList<String> strikesPositions = new ArrayList<>();

    public Player() {
    }

    public Board getBoard() {
        return playerBoard;
    }

    public ArrayList<String> getPlays() {
        return plays;
    }

    public ArrayList<String> getStrikesPositions() {
        return strikesPositions;
    }

}
