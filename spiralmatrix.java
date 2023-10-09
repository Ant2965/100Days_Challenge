public class spiralmatrix {
	
	public static void spiral(int num[][]) {
		int startrow=0;
		int startcol =0;
		int endrow = num.length-1;
		int endcol= num[0].length-1;
		
		while(startrow<=endrow && startcol<=endcol) {
			for(int j=startcol;j<=endcol;j++) {
				System.out.print(num [startrow][j]+" ");
			}
			for(int i= startrow+1;i<=endrow;i++) {
				System.out.print(num[i][endcol]+" ");
			}
			for (int j=endcol-1;j>=startcol;j--) {
				if(startrow==endrow) {
					break;
				}
				System.out.print((num)[endrow][j]+" ");
				
			}
			for (int i=endrow -1;i>=startrow+1;i--) {
				
				System.out.print(num[i][startcol]+" ");
				
			}
			startcol++;
			startrow++;
			endcol--;
			endrow--;
			
		}
		System.out.println(" ");

		
	}

	public static void main(String[] args) {
		int num[][]= {
		{1,2, 3,  4,22,30},
		{5,6, 7,  8,23,31},
		{9,10,11,12,24,32},
		{13,14,15,16,25,33},
		{7,18,19,20,21,34}
		};
		spiral(num);

	}
	

}
