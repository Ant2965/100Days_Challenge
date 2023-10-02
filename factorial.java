public class factorial {
	public static int fact(int n) {
		if(n==0){
			return 1;
		}
		int f1=n*fact(n-1);
		return f1;

	}

	public static void main(String[] args) {
		int n =12; // Write your desired number here.
		System.out.println(fact(n));

	}

}
