package backtracking;

public class Ratmaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows =3;
		int col =5;
		
		int count = maze(1,1,rows,col);
		System.out.println(count);

	}

	private static int maze(int sr, int sc, int er, int ec) {
		// TODO Auto-generated method stub
		
		
		if(sr>er ||sc>ec)return 0;
		if(sr==er && sc==ec)return 1;
		
		int downways= maze(sr+1,sc,er,ec);
		int rightways=maze(sr,sc+1,er,ec);
		
		int totalways= downways+rightways;
		
		return totalways;
	}

	
}
