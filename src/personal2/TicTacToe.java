package personal2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    private static int row;
    private static int column;
    private static final String player1 = "X";
    private static final String player2 = "O";
    private static final Scanner input = new Scanner(System.in);
    private static final String[][] displayBoard = new String[3][3];

    public static void main(String[] args) {
        clearDisplayBoard();
        playGame();
    }

    private static void playGame() {
        for (int i = 0; i <= 9; i++) {
            checkIfBoardIsFull();
            play(1, "X");
            checkIfBoardIsFull();
            showDisplayBoard();
            play(2, "O");
            checkIfBoardIsFull();
            showDisplayBoard();

        }
    }
    public static void clearDisplayBoard(){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                displayBoard[i][j] = " ";
            }
        }
        System.out.println("Player 1 --> X");
        System.out.println("Player 2 --> O");
    }

    public static void showDisplayBoard(){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(displayBoard[i][j]+" | ");
            }
            System.out.println();
        }
    }

    public static void play(int player, String tag){
        System.out.printf("Player %d turn: ",player);
        System.out.println("Enter number between 1 and 9: ");
        try{int number = input.nextInt();
            switch (number) {
                case 1:
                    row = 0;
                    column = 0;
                    break;
                case 2:
                    row = 0;
                    column = 1;
                    break;
                case 3:
                    row = 0;
                    column = 2;
                    break;
                case 4:
                    row = 1;
                    column = 0;
                    break;
                case 5:
                    row = 1;
                    column = 1;
                    break;
                case 6:
                    row = 1;
                    column = 2;
                    break;
                case 7:
                    row = 2;
                    column = 0;
                    break;
                case 8:
                    row = 2;
                    column = 1;
                    break;
                case 9:
                    row = 2;
                    column = 2;
                    break;
                default:
                    row = -1;
                    column = -1;
                    break;
            }

        if(!displayBoard[row][column].equals(" ")){
            System.out.println("Already filled, play again");
            play(player,tag);
        }

        else displayBoard[row][column] = tag;
        check(player,tag);}

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of range! Play again!");
            play(player, tag);
        }
        catch (InputMismatchException e){
            input.nextLine();
            System.out.println("Invalid input! Play again");
            play(player, tag);
        }

    }
    public static void check(int player, String tag){
        validatorForRow(0,tag,player);
        validatorForRow(1,tag,player);
        validatorForRow(2,tag,player);
        validatorForColumn(0,tag,player);
        validatorForColumn(1,tag,player);
        validatorForColumn(2,tag,player);
        validatorForDiagonal1(tag,player);
        validatorForDiagonal2(tag,player);
    }

    public static void validatorForRow(int row,String tag, int player){
        if (displayBoard[row][0].equals(tag) && displayBoard[row][1].equals(tag) && displayBoard[row][2].equals(tag)){
            System.out.println("player "+player +" wins!");
            showDisplayBoard();
            System.exit(0);
        }
    }
    public static void validatorForColumn(int column,String tag, int player){
        if (displayBoard[0][column].equals(tag) && displayBoard[1][column].equals(tag) && displayBoard[2][column].equals(tag)){
            System.out.println("player "+player +" wins!");
            showDisplayBoard();
            System.exit(0);
        }
    }
    public static void validatorForDiagonal1(String tag, int player){
        if (displayBoard[0][0].equals(tag) && displayBoard[1][1].equals(tag) && displayBoard[2][2].equals(tag)){
            System.out.println("player "+player +" wins!");
            showDisplayBoard();
            System.exit(0);
        }
    }
    public static void validatorForDiagonal2(String tag, int player){
        if (displayBoard[0][2].equals(tag) && displayBoard[1][1].equals(tag) && displayBoard[2][0].equals(tag)){
            System.out.println("player "+player +" wins!");
            showDisplayBoard();
            System.exit(0);
        }
    }
    public static void checkIfBoardIsFull(){
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!displayBoard[i][j].equals(" ")){
                    counter++;
                }
            }
        }
        if(counter == 9){
            System.out.println("Nobody won! Game over!");
            showDisplayBoard();
            System.exit(0);
        }
    }

}
