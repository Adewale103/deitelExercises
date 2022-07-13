package personal2;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeWithComputer {
    private static final SecureRandom random = new SecureRandom();
    private static int row;
    private static int column;
    private static String playerTag = "X";
    private static String computerTag = " ";
    private static final Scanner input = new Scanner(System.in);
    private static final String[][] displayBoard = new String[3][3];

    public static void main(String[] args) {
        clearDisplayBoard();
        playGame();
    }

    private static void playGame() {
        for (int i = 0; i <= 9; i++) {
            checkIfBoardIsFull();
            humanPlay();
            checkIfBoardIsFull();
            showDisplayBoard();
            computerPlay();
            checkIfBoardIsFull();
            showDisplayBoard();

        }
    }
    private static void pickTag(){
        System.out.println("Welcome, pick a tag! X or 0");
        String tag = input.nextLine();
        switch (tag.toUpperCase()) {
            case "X" -> {
                playerTag = "X";
                computerTag = "O";
                System.out.println("You --> X");
                System.out.println("Computer --> O");
            }
            case "O" -> {
                playerTag = "O";
                computerTag = "X";
                System.out.println("You --> O");
                System.out.println("Computer --> X");
            }
            default -> {
                System.out.println("Wrong Input! Let's start all over!");
                pickTag();
            }
        }

    }
    public static void clearDisplayBoard(){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                displayBoard[i][j] = " ";
            }
        }
        pickTag();
    }

    public static void showDisplayBoard(){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(displayBoard[i][j]+" | ");
            }
            System.out.println();
        }
    }

    public static void play(String player, String tag, int number){
        try{
            switch (number) {
                case 1 -> {
                    row = 0;
                    column = 0;
                }
                case 2 -> {
                    row = 0;
                    column = 1;
                }
                case 3 -> {
                    row = 0;
                    column = 2;
                }
                case 4 -> {
                    row = 1;
                    column = 0;
                }
                case 5 -> {
                    row = 1;
                    column = 1;
                }
                case 6 -> {
                    row = 1;
                    column = 2;
                }
                case 7 -> {
                    row = 2;
                    column = 0;
                }
                case 8 -> {
                    row = 2;
                    column = 1;
                }
                case 9 -> {
                    row = 2;
                    column = 2;
                }
                default -> {
                    row = -1;
                    column = -1;
                }
            }

            if(!displayBoard[row][column].equals(" ")){
                System.out.println("Already filled, play again");
                if(player.equals("Computer")){number = random.nextInt(1,10);}
                else{
                    System.out.println("Enter another number!");
                    number = input.nextInt();
                }
                play(player,tag,number);
            }

            else displayBoard[row][column] = tag;
            check(player,tag);}

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of range! Play again!");
                System.out.println("Enter another number!");
                number = input.nextInt();
            play(player, tag,number);
        }
        catch (InputMismatchException e){
            input.nextLine();
            System.out.println("Invalid input! Play again");
            if(player.equals("Computer")){number = random.nextInt(1,10);}
            else{
                System.out.println("Enter another number!");
                number = input.nextInt();
            }
            play(player, tag,number);
        }

    }
    public static void humanPlay(){
        System.out.println("Your turn");
        System.out.println("Enter number between 1 and 9: ");
        int number = input.nextInt();
        play("You",playerTag,number);
    }

    public static void computerPlay(){
        System.out.println("Computer turn");
        System.out.println("Enter number between 1 and 9: ");
        int number = random.nextInt(1,10);
        play("Computer",computerTag,number);

    }
    public static void check(String player, String tag){
        validatorForRow(0,tag,player);
        validatorForRow(1,tag,player);
        validatorForRow(2,tag,player);
        validatorForColumn(0,tag,player);
        validatorForColumn(1,tag,player);
        validatorForColumn(2,tag,player);
        validatorForDiagonal1(tag,player);
        validatorForDiagonal2(tag,player);
    }

    public static void validatorForRow(int row,String tag, String player){
        if (displayBoard[row][0].equals(tag) && displayBoard[row][1].equals(tag) && displayBoard[row][2].equals(tag)){
            System.out.println(player +" won!");
            showDisplayBoard();
            System.exit(0);
        }
    }
    public static void validatorForColumn(int column,String tag, String player){
        if (displayBoard[0][column].equals(tag) && displayBoard[1][column].equals(tag) && displayBoard[2][column].equals(tag)){
            System.out.println(player +" won!");
            showDisplayBoard();
            System.exit(0);
        }
    }
    public static void validatorForDiagonal1(String tag, String player){
        if (displayBoard[0][0].equals(tag) && displayBoard[1][1].equals(tag) && displayBoard[2][2].equals(tag)){
            System.out.println(player +" won!");
            showDisplayBoard();
            System.exit(0);
        }
    }
    public static void validatorForDiagonal2(String tag, String player){
        if (displayBoard[0][2].equals(tag) && displayBoard[1][1].equals(tag) && displayBoard[2][0].equals(tag)){
            System.out.println(player +" won!");
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
