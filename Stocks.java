import java.util.*;
public class Stocks {
	
	
	public static void profit(int price[]) {
		int currprice =0;
		int profit=0;
		int bp = price[0];
		
		ArrayList<Integer> a = new ArrayList<>(); 

		for(int i=1;i<price.length;i++) {

			
			profit=price[i]-bp;
			a.add(profit);
			System.out.print(profit);

			bp= Math.min(price[i], bp);
			
			
		}
		Collections.sort(a);
		System.out.println(a);

		System.out.println();

		System.out.println(a.get(a.size()-1));
	}

	public static void main(String[] args) {
		int price[]= {7,1,5,3,6,4};
		
		profit(price);
	}

}
