// package backtracking;

public class Printratpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows =3;
		int col =3;
		
		maze(1,1,rows,col,"");
	

	}

	private static void maze(int sr, int sc, int er, int ec,String s) {
		// TODO Auto-generated method stub
		if(sr>er||sc>ec)return;
		if(sr==er&&sc==ec) {
			System.out.println(s);
			return;
		}
		
		// down
		maze(sr+1,sc,er,ec,s+"D");
		maze(sr,sc+1,er,ec,s+"R");

		
	

	
}
}