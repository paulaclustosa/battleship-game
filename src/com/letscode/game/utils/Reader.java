package com.letscode.game.utils;

import com.letscode.game.entities.Board;
import com.letscode.game.entities.player.ComputerPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    private static final Scanner gameScanner = new Scanner(System.in);

    public static int scanTotalColumns() {
        Printer.printSetColumnsBoardMsg();
        int totalColumns = gameScanner.nextInt();

        while (Inspector.hasNumberOutOfBounds(totalColumns, 0, 26)) {
            Printer.printInvalidEntryRowsColumnsMsg();
            totalColumns = gameScanner.nextInt();
        }

        return totalColumns;
    }

    public static int scanTotalRows() {
        Printer.printSetRowsBoardMsg();
        int totalRows = gameScanner.nextInt();

        while (Inspector.hasNumberOutOfBounds(totalRows, 0, 26)) {
            Printer.printInvalidEntryRowsColumnsMsg();
            totalRows = gameScanner.nextInt();
        }

        return totalRows;

    }

    public static int scanTotalShips(int totalColumns, int totalRows) {
        int lowerLimitRef = 0;
        int upperLimitRef = totalColumns * totalRows;

        Printer.printSetTotalShipsMsg();
        int totalShips = gameScanner.nextInt();

        while (Inspector.hasNumberOutOfBounds(totalShips, lowerLimitRef, upperLimitRef)) {
            Printer.printInvalidEntryShipsMsg();
            totalShips = gameScanner.nextInt();
        }

        return totalShips;
    }

    public static String scanShipPosition(Board playerBoard) {
        System.out.print("Please enter your ship position: ");
        String shipPosition = gameScanner.next();

        while ( !playerBoard.getBoardPositions().contains(shipPosition) ||
                Inspector.hasPosition(playerBoard.getShips(), shipPosition)) {
            if (!playerBoard.getBoardPositions().contains(shipPosition)) {
                Printer.printPositionNotAvailableMsg();
            } else {
                Printer.printPositionAlreadyChosenMsg();
            }
            Printer.printEnterShipPositionMsg();
            shipPosition = gameScanner.next();
        }
        return shipPosition;
    }

    public static String scanPlayerPlay(ArrayList<String> humanPlayerPlays, ComputerPlayer cpuPlayer) {
        Printer.printYourTurnMsg();
        String position = gameScanner.next();

        while (!cpuPlayer.getBoard().getBoardPositions().contains(position) ||
                humanPlayerPlays.contains(position)) {
            if (!cpuPlayer.getBoard().getBoardPositions().contains(position)) {
                Printer.printPositionNotAvailableMsg();
            } else Printer.printPositionAlreadyChosenMsg();

            Printer.printEnterPositionMsg();
            position = gameScanner.next();
        }

        return position;
    }
}
