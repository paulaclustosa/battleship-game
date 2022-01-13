package com.letscode.game.service;

import com.letscode.game.entities.player.ComputerPlayer;
import com.letscode.game.entities.player.HumanPlayer;
import com.letscode.game.utils.Inspector;
import com.letscode.game.utils.Printer;

public class Core {

    private static boolean hasWinner = false;

    public static void startGame() {
        Printer.printWelcomeMsg();
        Printer.printGameInstructionsMsg();

        HumanPlayer human = new HumanPlayer();
        ComputerPlayer cpu = new ComputerPlayer();

        Printer.printBoardSettingsIntroHumanPlayerMsg();
        human.getBoard().setBoardSettings();

        Printer.printBoardSettingsIntroCpuPlayerMsg();
        cpu.getBoard().setBoardSettings();

        Printer.printShipSettingsIntroHumanPlayerMsg();
        human.getBoard().setTotalShips();

        Printer.printShipSettingsIntroCpuPlayerMsg();
        cpu.getBoard().setTotalShips();

        Printer.printShipsPositioningIntroMsg();
        human.getBoard().displayBoard(human, cpu);
        human.positionShips();
        cpu.positionShips();

        Printer.printStartRoundMsg();

        while (!hasWinner) {
            human.addPlay(cpu);
            System.out.println("OPPONENT BOARD:");
            cpu.getBoard().displayBoard(cpu, human);
            hasWinner = Inspector.hasWinner(human, cpu);
            if (hasWinner) { break; }

            cpu.addPlay(human);
            System.out.println("YOUR BOARD:");
            human.getBoard().displayBoard(human, cpu);
            hasWinner = Inspector.hasWinner(cpu, human);
            if (hasWinner) { break; }
        }
    }
}
