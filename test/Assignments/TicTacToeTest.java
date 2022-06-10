package Assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static Assignments.State.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe ticTacToe;

    @BeforeEach
    public void startWithThis() {
        ticTacToe = new TicTacToe();
        ticTacToe.fillDisplayBoardWithEmpty();
    }

    @Test
    public void ticTacToeExistTest() {
        assertNotNull(ticTacToe);
    }

    @Test
    public void boardIsEmptyByDefaultTest() {
        State[][] expected = {
                {E, E, E},
                {E, E, E},
                {E, E, E}};
        assertArrayEquals(expected, ticTacToe.getDisplayBoard());
    }

    @Test
    public void twoPlayersExistTest() {
        Player player1 = new Player(1, X);
        Player player2 = new Player(2, O);
        assertNotNull(player1);
        assertNotNull(player2);
    }

    @Test
    public void playerCanMakeMoveTest() {
        Player player1 = new Player(1, X);
     ticTacToe.makeMove(player1,1,1);
        State[][] expected = {
                {E, E, E},
                {E, X, E},
                {E, E, E}};
        assertArrayEquals(expected, ticTacToe.getDisplayBoard());
    }

    @Test
    public void twoPlayersCanMakeMoveTest() {
        Player player1 = new Player(1, X);
        Player player2 = new Player(2, O);
        ticTacToe.makeMove(player1,1,1);
        ticTacToe.makeMove(player2,0,1);
        State[][] expected = {
                {E, O, E},
                {E, X, E},
                {E, E, E}};
        assertArrayEquals(expected, ticTacToe.getDisplayBoard());
    }

    @Test
    public void twoPlayersCanMakeMultipleMovesTest() {
        Player player1 = new Player(1, X);
        Player player2 = new Player(2, O);
        ticTacToe.makeMove(player1,1,1);
        ticTacToe.makeMove(player2,0,1);
        ticTacToe.makeMove(player1,2,2);
        ticTacToe.makeMove(player2,1,2);
        ticTacToe.makeMove(player1,2,1);
        ticTacToe.makeMove(player2,0,0);
        State[][] expected = {
                {O, O, E},
                {E, X, O},
                {E, X, X}};
        assertArrayEquals(expected, ticTacToe.getDisplayBoard());
    }

    @Test
    public void boardCanBeCheckedIfItIsFullTest() {
        Player player1 = new Player(1, X);
        Player player2 = new Player(2, O);
        ticTacToe.makeMove(player1,1,1);
        ticTacToe.makeMove(player2,0,1);
        ticTacToe.makeMove(player1,2,2);
        ticTacToe.makeMove(player2,1,2);
        ticTacToe.makeMove(player1,2,1);
        ticTacToe.makeMove(player2,0,0);
       assertFalse(ticTacToe.isBoardFull());
    }

    @Test
    public void secondPlayerCanWinTestTest() {
        Player player1 = new Player(1, X);
        Player player2 = new Player(2, O);
        ticTacToe.makeMove(player1,1,2);
        ticTacToe.makeMove(player2,2,2);
        ticTacToe.makeMove(player1,0,1);
        ticTacToe.makeMove(player2,1,1);
        ticTacToe.makeMove(player1,2,1);
        ticTacToe.makeMove(player2,0,0);
        State[][] expected = {
                {O, X, E},
                {E, O, X},
                {E, X, O}};
        assertArrayEquals(expected, ticTacToe.getDisplayBoard());
        assertTrue(ticTacToe.checkResult(player2));
    }

    @Test
    public void firstPlayerCanWinTestTest() {
        Player player1 = new Player(1, X);
        Player player2 = new Player(2, O);
        ticTacToe.makeMove(player1,0,0);
        ticTacToe.makeMove(player2,1,2);
        ticTacToe.makeMove(player1,0,1);
        ticTacToe.makeMove(player2,1,1);
        ticTacToe.makeMove(player1,0,2);
        ticTacToe.makeMove(player2,2,2);
        State[][] expected = {
                {X, X, X},
                {E, O, O},
                {E, E, O}};
        assertArrayEquals(expected, ticTacToe.getDisplayBoard());
        assertTrue(ticTacToe.checkResult(player1));
    }

}
