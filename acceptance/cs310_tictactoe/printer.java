package tictactoe;
public class printer {
	 public static void printBoard() {
	      for (int row = 0; row < cs310_tictactoe.ROWS; ++row) {
	         for (int col = 0; col < cs310_tictactoe.COLS; ++col) {
	            printCell(cs310_tictactoe.board[row][col]);
	            if (col !=cs310_tictactoe.COLS - 1) {
	               System.out.print("|");
	            }
	         }
	         System.out.println();
	         if (row != cs310_tictactoe.ROWS - 1) {
	            System.out.println("-----------");
	         }
	      }
	      System.out.println();
	   }
	   
	   public static void printCell(int content) {
	      switch (content) {
	         case cs310_tictactoe.EMPTY:  System.out.print("   "); break;
	         case cs310_tictactoe.NOUGHT: System.out.print(" O "); break;
	         case cs310_tictactoe.CROSS:  System.out.print(" X "); break;
	      }
	   }
}
