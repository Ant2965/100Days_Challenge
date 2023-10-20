public class permutation {
	public static void permu(String a, String b ) {
		if(a.length()== 0) {
			System.out.println(b);
			
			return;
			
		}
		
		for(int i=0;i<a.length();i++) {
		     char curr = a.charAt(i);
		   String c=  a.substring(0,i)+a.substring(i+1);
		   permu(c,b+curr);
		     
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		String b ="";
		permu(a,b);

	}

}
