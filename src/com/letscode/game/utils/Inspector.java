package com.letscode.game.utils;

import com.letscode.game.entities.Ship;
import com.letscode.game.entities.player.Player;

import java.util.Objects;

public class Inspector {

    public static Boolean hasNumberOutOfBounds(int number, int lowerLimitRef, int upperLimitRef) {
        return number <= lowerLimitRef || number > upperLimitRef;
    }

    public static Boolean hasPosition(Ship[] ships, String position) {
        for (Ship ship : ships) {
            String currentShipPosition = ship.position;
            if (Objects.equals(currentShipPosition, position)) return true;
        }
        return false;
    }

    public static Boolean hasWinner(Player currentPlayer, Player standByPlayer) {
        if (currentPlayer.getStrikesPositions().size() == standByPlayer.getBoard().getShips().length) {
            System.out.println("\nTHE END!\n");
            return true;
        }
        else return false;
    }
}
