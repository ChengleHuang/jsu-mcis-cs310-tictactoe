package tictactoe;

public class mover {
	 public static void playerMove(int theSeed) {
	      boolean validInput = false;
	      do {
	         if (theSeed == cs310_tictactoe.CROSS) {
	            System.out.print("Player 'X', enter your move (Column[1-3] Row[1-3]): ");
	         } else {
	            System.out.print("Player 'O', enter your move (Column[1-3] Row[1-3]): ");
	         }
	         int col = cs310_tictactoe.in.nextInt() - 1;
	         int row = cs310_tictactoe.in.nextInt() - 1;
	         if (row >= 0 && row < cs310_tictactoe.ROWS && col >= 0 && col < cs310_tictactoe.COLS && cs310_tictactoe.board[row][col] == cs310_tictactoe.EMPTY) {
	        	 cs310_tictactoe.currntRow = row;
	        	 cs310_tictactoe.currentCol = col;
	        	 cs310_tictactoe.board[cs310_tictactoe.currntRow][cs310_tictactoe.currentCol] = theSeed;
	            validInput = true;
	         } else {
	            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
	                  + ") is not valid. Try again...");
	         }
	      } while (!validInput);
	   }
}
