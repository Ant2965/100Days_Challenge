import java.util.Scanner;

public class binarysearch {
	
	public static int binary(int num[],int a) {
		int start=0;int end=num.length;
		for(int i=start;i<=end;i++) {
		  int mid = (start+end)/2;
		 // System.out.println(mid);

		  if(num[mid]==a) {
			  //System.out.println(mid);
			return mid;

		  }
		  else if(num[mid]>a) {
			  end = mid-1;
		  }
		  else {
			  start=mid+1;
		  }		  
		}
		return 1;
	}

	public static void main(String[] args) {
		
		int num[] = {1,3,4,5,76,566,777,4545,7698};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c= binary(num,a);
		if(c==1) {
		System.out.println("not found");
	}
		else {
			System.out.println(c);
		}
}
}