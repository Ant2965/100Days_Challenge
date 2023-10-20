public class pairing {
	public static int pair(int n) {
		if(n==1 || n==2) {
			return n;
			
		}
		//  Single
		
		int a=pair(n-1);
		
		//pair
		
		int b = n-1*pair(n-2);
		
		return a+b;
		
		
	}

	public static void main(String[] args) {
		
		int n =15;
		System.out.print( pair(n));
		
		

	}

}