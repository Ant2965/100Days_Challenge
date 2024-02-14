public class i
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int d=0;
		
		for(int i=1;i<31;++i){
		    for(int j=1;j<31;++j){
		        for(int k=1;k<31;++k){
		            if((i+j+k)%3)==0){
		                d=d+1;
		            }
		        }
		    }
		}
        System.out.prinln(d);

	}
}
