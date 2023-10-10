public class sum {//athe salary paid is
	public static int sumn(int n) {
		if(n==1) {
			return 1;
		}
		int a=n+sumn(n-1);
		return a;
		
		//System.out.println(return(a);
	}

	public static void main(String[] args) {
		
		int n=7;
		System.out.println(sumn(n));
		


	}

}
