package com.letscode.game.entities.player;

import com.letscode.game.entities.Ship;
import com.letscode.game.utils.Inspector;
import com.letscode.game.utils.Printer;
import com.letscode.game.utils.Reader;

public class HumanPlayer extends Player {

    public HumanPlayer() {
        super();
    }

    public void positionShips() {
        for (Ship ship : playerBoard.getShips()) {
            ship.position = Reader.scanShipPosition(playerBoard);
        }
    }

    public void addPlay(ComputerPlayer cpuPlayer) {
            String position = Reader.scanPlayerPlay(plays, cpuPlayer);
            plays.add(position);
            checkHumanStrike(position, cpuPlayer);
    }

    public void checkHumanStrike(String position, ComputerPlayer cpuPlayer) {
        if (Inspector.hasPosition(cpuPlayer.getBoard().getShips(), position)) {
            Printer.printHumanHitMsg();
            strikesPositions.add(position);
        } else Printer.printHumanMissedMsg();
    }
}
