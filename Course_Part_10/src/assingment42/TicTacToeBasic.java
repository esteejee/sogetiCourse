package assingment42;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeBasic {
    private static final String SYMBOL_PLAYER = "XX";
    private static final String SYMBOL_COMPUTER = "OO";


    public static void main(String[] args) {

        //boolean isPlayerComputer = true;


        Scanner scanner = new Scanner (System.in);
        String[][] board = new String[3][3];
        System.out.println ("Welcome to Tic-Tac-Toe");
        drawBoardWithFirstPositions (board);  // leeg bord met de te kiezen posities
//        drawBoard(board);


        while (true) {
            // we starten met de beurt voor de speler

            if (isGameFinished (board)) {
                break;
            } else {
                playersTurn (board, scanner);
            }
            //               drawBoard(board);

            if (isGameFinished (board)) {
                break;
            } else {
                computersTurn (board);
            }

            //               drawBoard(board);
        }
    }


    public static void drawBoardWithFirstPositions(String[][] board) {

        System.out.print (board[0][0] = "A1");
        System.out.print ("|");
        System.out.print (board[0][1] = "B1");
        System.out.print ("|");
        System.out.println (board[0][2] = "C1");
        System.out.println ("-------");
        System.out.print (board[1][0] = "A2");
        System.out.print ("|");
        System.out.print (board[1][1] = "B2");
        System.out.print ("|");
        System.out.println (board[1][2] = "C2");
        System.out.println ("-------");
        System.out.print (board[2][0] = "A3");
        System.out.print ("|");
        System.out.print (board[2][1] = "B3");
        System.out.print ("|");
        System.out.println (board[2][2] = "C3");
    }

    public static void drawBoard(String[][] board) {
        System.out.print (board[0][0]);
        System.out.print ("|");
        System.out.print (board[0][1]);
        System.out.print ("|");
        System.out.println (board[0][2]);
        System.out.println ("-------");
        System.out.print (board[1][0]);
        System.out.print ("|");
        System.out.print (board[1][1]);
        System.out.print ("|");
        System.out.println (board[1][2]);
        System.out.println ("-------");
        System.out.print (board[2][0]);
        System.out.print ("|");
        System.out.print (board[2][1]);
        System.out.print ("|");
        System.out.println (board[2][2]);
    }

    private static boolean isGameFinished(String[][] board) {
        // player is winner
        if (isWinner (board, SYMBOL_PLAYER)) {
            drawBoard (board);
            System.out.println ("Player with symbol " + SYMBOL_PLAYER + " wins!");
            return true;
        }
        // computer is winner
        if (isWinner (board, SYMBOL_COMPUTER)) {
            drawBoard (board);
            System.out.println ("Player with symbol " + SYMBOL_COMPUTER + " wins!");
            return true;
        }

        //       drawBoard (board);
        // zijn er nog lege velden? Dan moet het spel doorgaan!
        for (String[] strings : board) {
            for (String string : strings) {
                if (!string.equals ("OO")) {
                    if (!string.equals (" XX")) {
                        return false;
                    }
                }
            }
        }
        // en anders is het gelijkspel!
        drawBoard (board);
        System.out.println ("The game ended in a tie!");
        return true;
    }

    private static boolean isWinner(String[][] board, String symbol) {
        return (board[0][0].equals (symbol) && board[0][1].equals (symbol) && board[0][2].equals (symbol)) ||
                (board[1][0].equals (symbol) && board[1][1].equals (symbol) && board[1][2].equals (symbol)) ||
                (board[2][0].equals (symbol) && board[2][1].equals (symbol) && board[2][2].equals (symbol)) ||
                (board[0][0].equals (symbol) && board[1][0].equals (symbol) && board[2][0].equals (symbol)) ||
                (board[0][0].equals (symbol) && board[1][1].equals (symbol) && board[2][2].equals (symbol)) ||
                (board[2][0].equals (symbol) && board[1][1].equals (symbol) && board[0][2].equals (symbol)) ||
                (board[0][2].equals (symbol) && board[1][2].equals (symbol) && board[2][2].equals (symbol));
    }


    private static void playersTurn(String[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println ("Please, enter your move (row number)");
            userInput = scanner.nextLine ();
            System.out.println ("Userinput is:" + userInput);

            if (isValidMove (board, userInput)) {
                System.out.println ("Your move is placed");
                break;
            } else {
                System.out.println (userInput + " is not a valid move.");
            }
        }
        // leg de positie vast
        placeTheMove (board, userInput, SYMBOL_PLAYER);
    }

    private static void computersTurn(String[][] board) {

        Random rn = new Random ();
        int computerInput;
        String computerMove = "  ";

        while (true) {
            computerInput = rn.nextInt (9) + 1;
            System.out.println ("ComputerInput: " + computerInput);
            switch (computerInput) {
                case 1:
                    computerMove = "A1";
                    break;
                case 2:
                    computerMove = "B1";
                    break;
                case 3:
                    computerMove = "C1";
                    break;
                case 4:
                    computerMove = "A2";
                    break;
                case 5:
                    computerMove = "B2";
                    break;
                case 6:
                    computerMove = "C2";
                    break;
                case 7:
                    computerMove = "A3";
                    break;
                case 8:
                    computerMove = "B3";
                    break;
                case 9:
                    computerMove = "C3";
                    break;
                default:
                    System.out.println ("Computer move outside the board");
            }
            if (isValidMove (board, computerMove)) {
                System.out.println ("ComputerMove is: " + computerMove);
                System.out.println ("Computer move is placed");
                break;
            }
//            } else {
//                System.out.println (computerMove + " is not a valid move.");
//            }
//        }
            }
        placeTheMove (board, computerMove, SYMBOL_COMPUTER);

    }

    private static void placeTheMove(String[][] board, String position, String symbol) {
        switch (position) {
            case "A1":
                board[0][0] = symbol;
                break;
            case "B1":
                board[0][1] = symbol;
                break;
            case "C1":
                board[0][2] = symbol;
                break;
            case "A2":
                board[1][0] = symbol;
                break;
            case "B2":
                board[1][1] = symbol;
                break;
            case "C2":
                board[1][2] = symbol;
                break;
            case "A3":
                board[2][0] = symbol;
                break;
            case "B3":
                board[2][1] = symbol;
                break;
            case "C3":
                board[2][2] = symbol;
                break;
            default:
                System.out.println ("It's a position outside the board");
        }
        drawBoard (board);
    }

    private static boolean isValidMove(String[][] board, String position) {
        switch (position) {
            case "A1":
                return board[0][0].equals ("A1");
            case "B1":
                return board[0][1].equals ("B1");
            case "C1":
                return board[0][2].equals ("C1");
            case "A2":
                return board[1][0].equals ("A2");
            case "B2":
                return board[1][1].equals ("B2");
            case "C2":
                return board[1][2].equals ("C2");
            case "A3":
                return board[2][0].equals ("A3");
            case "B3":
                return board[2][1].equals ("B3");
            case "C3":
                return board[2][2].equals ("C3");
            default:
                return false;
        }
    }
}
