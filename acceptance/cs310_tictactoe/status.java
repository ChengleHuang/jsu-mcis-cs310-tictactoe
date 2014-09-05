package tictactoe;

public class status {
	   public static void updateGame(int theSeed, int currentRow, int currentCol) {
		      if (hasWon(theSeed, currentRow, currentCol)) { 
		    	  cs310_tictactoe.currentState = (theSeed == cs310_tictactoe.CROSS) ? cs310_tictactoe.CROSS_WON : cs310_tictactoe.NOUGHT_WON;
		      } else if (isDraw()) { 
		    	  cs310_tictactoe.currentState = cs310_tictactoe.DRAW;
		      }
		   }
		   public static boolean isDraw() {
		      for (int row = 0; row < cs310_tictactoe.ROWS; ++row) {
		         for (int col = 0; col < cs310_tictactoe.COLS; ++col) {
		            if (cs310_tictactoe.board[row][col] == cs310_tictactoe.EMPTY) {
		               return false;
		            }
		         }
		      }
		      return true;
		   }
		 
		   public static boolean hasWon(int theSeed, int currentRow, int currentCol) {
		      return (cs310_tictactoe.board[currentRow][0] == theSeed
		                   && cs310_tictactoe.board[currentRow][1] == theSeed
		                   && cs310_tictactoe.board[currentRow][2] == theSeed
		              || cs310_tictactoe.board[0][currentCol] == theSeed
		                   && cs310_tictactoe.board[1][currentCol] == theSeed
		                   && cs310_tictactoe.board[2][currentCol] == theSeed
		              || currentRow == currentCol
		                   && cs310_tictactoe.board[0][0] == theSeed
		                   && cs310_tictactoe.board[1][1] == theSeed
		                   && cs310_tictactoe.board[2][2] == theSeed
		              || currentRow + currentCol == 2
		                   && cs310_tictactoe.board[0][2] == theSeed
		                   && cs310_tictactoe.board[1][1] == theSeed
		                   && cs310_tictactoe.board[2][0] == theSeed);
		   }
}
