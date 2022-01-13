package com.letscode.game.entities.player;

import com.letscode.game.entities.Ship;
import com.letscode.game.utils.Inspector;
import com.letscode.game.utils.Printer;

import java.util.Random;

public class ComputerPlayer extends Player {

    private Random random = new Random();

    public ComputerPlayer() {
        super();
    }

    public void positionShips() {
        for (Ship ship : playerBoard.getShips()) {
            int randomRowCoordinateIndex = random.nextInt(playerBoard.getActualRowCoordinates().length);
            int randomColumnCoordinateIndex = random.nextInt(playerBoard.getActualColumnCoordinates().length);

            String randomPosition = playerBoard.getActualRowCoordinates()[randomRowCoordinateIndex] +
                    playerBoard.getActualColumnCoordinates()[randomColumnCoordinateIndex];

            while(Inspector.hasPosition(playerBoard.getShips(), randomPosition)) {
                randomRowCoordinateIndex = random.nextInt(playerBoard.getActualRowCoordinates().length);
                randomColumnCoordinateIndex = random.nextInt(playerBoard.getActualColumnCoordinates().length);

                randomPosition = playerBoard.getActualRowCoordinates()[randomRowCoordinateIndex] +
                        playerBoard.getActualColumnCoordinates()[randomColumnCoordinateIndex];
            }

            ship.position = randomPosition;
        }
    }

    public void addPlay(HumanPlayer humanPlayer) {
            int randomRowCoordinateIndex = random.nextInt(playerBoard.getActualRowCoordinates().length);
            int randomColumnCoordinateIndex = random.nextInt(playerBoard.getActualColumnCoordinates().length);

            String randomPosition = playerBoard.getActualRowCoordinates()[randomRowCoordinateIndex] +
                    playerBoard.getActualColumnCoordinates()[randomColumnCoordinateIndex];

            while (plays.contains(randomPosition)) {
                Printer.printPositionAlreadyChosenMsg();
                randomRowCoordinateIndex = random.nextInt(playerBoard.getActualRowCoordinates().length);
                randomColumnCoordinateIndex = random.nextInt(playerBoard.getActualColumnCoordinates().length);

                randomPosition = playerBoard.getActualRowCoordinates()[randomRowCoordinateIndex] +
                        playerBoard.getActualColumnCoordinates()[randomColumnCoordinateIndex];
            }

            plays.add(randomPosition);
            checkHumanStrike(randomPosition, humanPlayer);
    }

    public void checkHumanStrike(String position, HumanPlayer humanPlayer) {
        if (Inspector.hasPosition(humanPlayer.getBoard().getShips(), position)) {
            Printer.printCpuHitMsg();
            strikesPositions.add(position);
        } else Printer.printCpuMissedMsg();
    }

}
