public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		System.out.println(square);
		int row=square/8;
		if(row%2==0) {
			int col=square%8;
			if(col%2==0)
				return false;
		}
		else {
			int col=square%8;
			if(col%2==1)
				return false;
		}
		
		return true;
	}
}
