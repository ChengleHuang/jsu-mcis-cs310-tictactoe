package tictactoe;
import java.util.Scanner;
public class cs310_tictactoe{
	   public static final int EMPTY = 0;
	   public static final int CROSS = 1;
	   public static final int NOUGHT = 2;
	   public static final int PLAYING = 0;
	   public static final int DRAW = 1;
	   
	   public static final int CROSS_WON = 2;
	   public static final int NOUGHT_WON = 3;
	   public static final int ROWS = 3, COLS = 3;
	   public static int[][] board = new int[ROWS][COLS];
	   
	   public static int currentState;
	   public static int currentPlayer;
	   public static int currntRow, currentCol;
	   public static Scanner in = new Scanner(System.in);
	   
	   public static void main(String[] args) {
		   for (int row = 0; row < ROWS; ++row) {
		         for (int col = 0; col < COLS; ++col) {
		            board[row][col] = EMPTY;
		         }
		      }
		      currentState = PLAYING;
		      currentPlayer = CROSS;
		      do {
		         mover.playerMove(currentPlayer);
		         status.updateGame(currentPlayer, currntRow, currentCol);
		         printer.printBoard();
		         if (currentState == CROSS_WON) {
		            System.out.println("Winner is 'X'! Bye!");
		         } 
		         else if (currentState == NOUGHT_WON) {
		            System.out.println("Winner is 'O'! Bye!");
		         } 
		         else if (currentState == DRAW) {
		            System.out.println("It's a Draw! Bye!");
		         }
		         currentPlayer = (currentPlayer == CROSS) ? NOUGHT : CROSS;
		      } 
		      while (currentState == PLAYING);
		   }
}
