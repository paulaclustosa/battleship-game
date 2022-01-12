package com.letscode.game.entities;

import com.letscode.game.entities.player.Player;
import com.letscode.game.utils.Inspector;
import com.letscode.game.utils.Reader;

import java.util.ArrayList;

public class Board {

    final private String[] REF_ROW_COORDINATES = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    final private String[] REF_COLUMN_COORDINATES = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" };
    private int totalRows;
    private int totalColumns;
    private String[] actualRowCoordinates;
    private String[] actualColumnCoordinates;
    private ArrayList<String> boardPositions = new ArrayList<>();
    private int totalShips;
    private Ship[] ships;

    public Board() {
    }

    private void setTotalRows() {
        this.totalRows = Reader.scanTotalRows();
        actualRowCoordinates = new String[totalRows];
        System.arraycopy(REF_ROW_COORDINATES, 0, actualRowCoordinates, 0, actualRowCoordinates.length);
    }

    private void setTotalColumns() {
        this.totalColumns = Reader.scanTotalColumns();
        actualColumnCoordinates = new String[totalColumns];
        System.arraycopy(REF_COLUMN_COORDINATES, 0, actualColumnCoordinates, 0, actualColumnCoordinates.length);
    }

    public void setBoardSettings() {
        setTotalRows();
        setTotalColumns();
        setBoardPositions();
    }

    public String[] getActualRowCoordinates() {
        return actualRowCoordinates;
    }

    public String[] getActualColumnCoordinates() {
        return actualColumnCoordinates;
    }

    public ArrayList<String> getBoardPositions() {
        return boardPositions;
    }

    private void setBoardPositions() {
        for (String letter : actualRowCoordinates) {
            for (String number : actualColumnCoordinates) {
                boardPositions.add(letter + number);
            }
        }
    }

    public void setTotalShips() {
        this.totalShips = Reader.scanTotalShips(totalColumns, totalRows);
        setShips();
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips() {
        this.ships = new Ship[totalShips];
        for (int i = 0; i < ships.length; i++) {
            ships[i] = new Ship();
        }
    }

    public void displayBoard(Player player, Player opponent) {
        final String HIT = " ** |";
        final String MISS = " -- |";
        final String NO_PLAY = "    |";
        final String BOARD_LINE = new String (new char[totalColumns+1]).replace("\0", "-----");

        System.out.println(BOARD_LINE);
        System.out.print("|   |");
        for (String number : actualColumnCoordinates) {
            System.out.print(" " + number + " |");
        }
        System.out.println();
        System.out.println(BOARD_LINE);

        for (String letter : actualRowCoordinates) {
            System.out.print("| " + letter + " |");
            for (String number : actualColumnCoordinates) {
                if (opponent.getPlays().contains(letter + number)) {
                    if (Inspector.hasPosition(player.getBoard().getShips(), letter + number))
                        System.out.print(HIT);
                    else System.out.print(MISS);
                }
                else System.out.print(NO_PLAY);
            }
            System.out.println();
            System.out.println(BOARD_LINE);
        }
    }
}

