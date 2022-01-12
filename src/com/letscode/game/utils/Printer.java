package com.letscode.game.utils;

public class Printer {

    private final static String ANSI_BLUE = "\u001B[34m";
    private final static String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private final static String ANSI_GREEN = "\u001B[32m";
    private final static String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private final static String ANSI_RESET = "\u001B[0m";
    private final static String WELCOME_MSG =
            "Welcome to The Battleship Game! =D" +
            "\n";
    private final static String GENERAL_INSTRUCTIONS_MSG =
            "-------------------------------------------------------------------------------------\n" +
            "| GENERAL INSTRUCTIONS                                                              |\n" +
            "| - You and your opponent have ships to be placed in individual boards.             |\n" +
            "| - The boards have a two-dimensional grid-based layout.                            |\n" +
            "| - The grid has letter-number coordinates, each representing a board position.     |\n" +
            "| - You should set the total rows and columns the boards to have.                   |\n" +
            "| - You should also set the total ships available for both you and your opponent.   |\n" +
            "| - The goal of the game is to be the first to sink all of your opponent's ships.   |\n" +
            "-------------------------------------------------------------------------------------";
    private final static String BOARD_INSTRUCTIONS_MSG =
            "-------------------------------------------------------------------------------------\n" +
            "| BOARD SETTINGS INSTRUCTIONS                                                       |\n" +
            "| - The total number of columns and rows provided must be an integer number between |\n" +
            "| 1 and 26.                                                                         |\n" +
            "-------------------------------------------------------------------------------------";
    private final static String SHIPS_INSTRUCTIONS_MSG =
            "-------------------------------------------------------------------------------------\n" +
            "| SHIPS SETTINGS INSTRUCTIONS                                                       |\n" +
            "| - The total number of ships must be an integer number between 1 and the total     |\n" +
            "| board's positions (total columns * total rows).                                   |\n" +
            "-------------------------------------------------------------------------------------";
    private final static String INTRO_BOARD_SETTINGS_HUMAN_MSG =
            "\n" +
            "Hello, human! It's " +
            ANSI_BLUE_BACKGROUND + "board's settings time" +  ANSI_RESET + "! =D" + "\n" +
            "\n" +
            "Please enter the board's settings of " +
            ANSI_BLUE + "YOUR BOARD." + ANSI_RESET;
    private final static String INTRO_BOARD_SETTINGS_CPU_MSG =
            "Please enter the board's settings of your " +
            ANSI_BLUE + "OPPONENT'S BOARD." + ANSI_RESET;
    private final static String SET_TOTAL_ROWS_MSG =
            "Please enter it's number of rows (1-26): ";
    private final static String SET_TOTAL_COLUMNS_MSG =
            "Please enter it's number of columns (1-26): ";
    private final static String INVALID_ENTRY_COLUMNS_ROWS_MSG =
            "Invalid entry!\n"+
            "Please enter an integer number between 1 and 26: ";
    private final static String INTRO_SHIP_SETTINGS_HUMAN_MSG =
            "\n" +
            "Ok... Now it's " +
            ANSI_GREEN_BACKGROUND + "ships settings time" + ANSI_RESET + "! =D\n" +
            "\n" +
            "Please enter " +
            ANSI_GREEN + "YOUR SHIPS " + ANSI_RESET + "settings.";

    private final static String INTRO_SHIP_SETTINGS_CPU_MSG =
            "Please enter your " +
            ANSI_GREEN + "OPPONENT'S SHIPS " + ANSI_RESET + "settings.";

    private final static String INTRO_SHIP_POSITIONING_MSG =
            "\n" +
            "Ok... and lastly (before we actually start " +
            "playing), please position " +
            ANSI_GREEN + "YOUR SHIPS " + ANSI_RESET +
            "in the board.\n" +
            "\n" +
            "Remember that your board is like displayed above: ";

    private final static String SET_TOTAL_SHIPS_MSG =
            "Please enter the total number of ships: ";
    private final static String INVALID_ENTRY_SHIPS =
            "Invalid entry!\n"+
            "Please enter an integer number between 1 and the total " +
            "board's positions (total columns * total rows): ";

    private final static String START_ROUND_MSG =
        "\n" +
        "Ok... finally... let's start playing! =D" +
        "\n";

    private final static String POSITION_NOT_AVAILABLE_MSG = "Invalid entry!\n" +
            "This position is not available.";

    private final static String POSITION_ALREADY_CHOSEN_MSG = "Invalid entry!\n" +
            "You've already chosen the entered position.";

    private final static String ENTER_SHIP_POSITION_MSG = "Please enter your ship position: ";

    private final static String YOUR_TURN_MSG = "It's your turn: try to hit one of your opponent's ships!";

    private final static String ENTER_POSITION_MSG = "Please enter a position: ";

    private final static String HUMAN_HIT_MSG = "Cool! It was a hit: a ship has sank! =D";

    private final static String HUMAN_MISSES_MSG = "Sorry! You've missed the shot. It hit water. =(";

    private final static String CPU_HIT_MSG = "Your opponent hit one of your ships!";

    private final static String CPU_MISSED_MSG = "Wow! Your opponent missed the shot!";

    private static void printGeneralInstructionsMsg() {
        System.out.println(GENERAL_INSTRUCTIONS_MSG);
    }

    private static void printBoardInstructionsMsg() {
        System.out.println(BOARD_INSTRUCTIONS_MSG);
    }

    private static void printShipsInstructionsMsg() {
        System.out.println(SHIPS_INSTRUCTIONS_MSG);
    }

    public static void printWelcomeMsg() {
        System.out.println(WELCOME_MSG);
    }

    public static void printGameInstructionsMsg() {
        printGeneralInstructionsMsg();
        printBoardInstructionsMsg();
        printShipsInstructionsMsg();
    }

    public static void printBoardSettingsIntroHumanPlayerMsg() {
        System.out.println(INTRO_BOARD_SETTINGS_HUMAN_MSG);
    }

    public static void printBoardSettingsIntroCpuPlayerMsg() {
        System.out.println(INTRO_BOARD_SETTINGS_CPU_MSG);
    }

    public static void printSetRowsBoardMsg() {
        System.out.print(SET_TOTAL_ROWS_MSG);
    }

    public static void printSetColumnsBoardMsg() {
        System.out.print(SET_TOTAL_COLUMNS_MSG);
    }

    public static void printInvalidEntryRowsColumnsMsg() {
        System.out.print(INVALID_ENTRY_COLUMNS_ROWS_MSG);
    }

    public static void printShipSettingsIntroHumanPlayerMsg() {
        System.out.println(INTRO_SHIP_SETTINGS_HUMAN_MSG);
    }

    public static void printShipSettingsIntroCpuPlayerMsg() {
        System.out.println(INTRO_SHIP_SETTINGS_CPU_MSG);
    }

    public static void printSetTotalShipsMsg() {
        System.out.print(SET_TOTAL_SHIPS_MSG);
    }

    public static void printInvalidEntryShipsMsg() {
        System.out.print(INVALID_ENTRY_SHIPS);
    }

    public static void printShipsPositioningIntroMsg() {
        System.out.println(INTRO_SHIP_POSITIONING_MSG);
    }

    public static void printEnterShipPositionMsg() {
        System.out.print(ENTER_SHIP_POSITION_MSG);
    }

    public static void printPositionNotAvailableMsg() {
        System.out.println(POSITION_NOT_AVAILABLE_MSG);
    }

    public static void printPositionAlreadyChosenMsg() {
        System.out.println(POSITION_ALREADY_CHOSEN_MSG);
    }

    public static void printStartRoundMsg() {
        System.out.println(START_ROUND_MSG);
    }

    public static void printYourTurnMsg() {
        System.out.println(YOUR_TURN_MSG);
        printEnterPositionMsg();
    }

    public static void printEnterPositionMsg() {
        System.out.print(ENTER_POSITION_MSG);
    }

    public static void printHumanHitMsg() {
        System.out.println(HUMAN_HIT_MSG);
    }

    public static void printHumanMissedMsg() {
        System.out.println(HUMAN_MISSES_MSG);
    }

    public static void printCpuHitMsg() {
        System.out.println(CPU_HIT_MSG);
    }

    public static void printCpuMissedMsg() {
        System.out.println(CPU_MISSED_MSG);
    }
}
