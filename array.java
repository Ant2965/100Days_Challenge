public class array {
	public static void value(int num[],int a,int i) {
		//int i=0;
		if(i==num.length) {
			return;
		}
		
		 num[i]= a;		
		
		value(num,a*5,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          int i=0;
		int num[]=new int[20];
		
		value(num,1,0);
		
		
		for(int j=0;j<num.length;j++) {
			System.out.println(num[j]);

		}

	}

}