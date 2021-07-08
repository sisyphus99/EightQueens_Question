public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
        
		return cellId/8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId%8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................
			
			

		*/
		for(int j=0;j<8;j++) {
			if(placedQueens[row][j]==true)
				return false;
		}
		for(int j=0;j<8;j++) {
			if(placedQueens[j][col]==true)
				return false;
		}
		int r=row,c=col;
		while(r>=0 && c>=0)
		{
			if(placedQueens[r][c]==true)
				return false;
			r--;
			c--;
		}
		r=row;
		c=col;
		while(r>=0 && c<8)
		{
			if(placedQueens[r][c]==true)
				return false;
			r--;
			c++;
		}
		r=row;
		c=col;
		while(r<8 && c>=0)
		{
			if(placedQueens[r][c]==true)
				return false;
			r++;
			c--;
		}
		r=row;
		c=col;
		while(r<8 && c<8)
		{
			if(placedQueens[r][c]==true)
				return false;
			r++;
			c++;
		}
		numQueens++;
		placedQueens[row][col]=true;
		return true;
	}
}














