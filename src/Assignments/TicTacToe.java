package Assignments;

import java.util.Arrays;
import java.util.Scanner;

import static Assignments.State.*;

public class TicTacToe {

    private State[][] state;
    private Result result = new Result();
    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;


    public TicTacToe() {
        state = new State[3][3];
    }

    public State[][] getDisplayBoard() {
        return state;
    }

    public void showDisplayBoard(){
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[i].length; j++) {
                System.out.print(state[i][j]+" | ");
            }
            System.out.println();
        }
    }

    public void fillDisplayBoardWithEmpty(){
        for (int i = 0; i < state.length; i++) {
            Arrays.fill(state[i], E);
        }
    }
    public void makeMove(Player player,int row, int column){
        player.makeMove(row,column,state);
    }

    private boolean isEmpty(int row, int column){
        if(state[row][column] == E){
            return true;
        }
        return false;
    }

    public boolean isBoardFull(){
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!state[i][j].equals(E)){
                    counter++;
                }
            }
        }
        if(counter == 9){
            System.out.println("Nobody won! Game over!");
            return true;
        }
        return false;
    }

    public boolean checkResult(Player player){
        return result.check(player,state);
    }

    private void chooseTag(){
    fillDisplayBoardWithEmpty();
        System.out.println("Welcome!");
        System.out.println("Please enter the tag you would like to use (X or O)");
        String tag = input.nextLine();
        switch (tag) {
            case "X":
                player1 = new Player(1, X);
                System.out.println("The second player tag is O");
                player2 = new Player(2, O);
                break;
            case "O":
                player1 = new Player(1, O);
                System.out.println("The second player tag is X");
                player2 = new Player(2, X);
                break;
            default:
                chooseTag();
                break;
        }
    }
    public void playGame(Player player){
        System.out.printf("Player %s turn: ",player);
        System.out.println("Select row followed by column to play");
        int row = input.nextInt();
        int column = input.nextInt();
        input.nextLine();

        if(isEmpty(row,column)){makeMove(player,row,column);}
        else{
            System.out.println("Already filled, please play again!");
            playGame(player);
        }
        if(checkResult(player)){
            System.out.printf("%s wins!",player);
            showDisplayBoard();
            System.exit(0);
        }
        if(isBoardFull()){

        }
    }
}
