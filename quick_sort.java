public class quick_sort {
	public static void quicksort(int num[], int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pindex=partition(num,si,ei);

		quicksort(num,si,pindex-1);
		quicksort(num,pindex+1,ei);
		}
		
	
	public static int partition(int num[],int si,int ei) {
		int temp ;
		int j =si;
		int pivot =num[ei];
		for(int i=si;i<ei;i++) {
			
			if(num[i]<pivot) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				
				j=j+1;	
				
				
			}
			
		}
		temp =pivot;
		num[ei]=num[j];
		num[j]=temp;
		return j;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {3,6,9,8,2,5};
		quicksort( num,0,num.length-1);
		
		for(int a=0;a<num.length;a++) {
			System.out.print(num[a]+" ");
		}

	}

}