public class test {


    public static void main(String args[]){

        int a[]= {1,2,3,45,6};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==9){
                    System.out.println("yes");
                }
                
                //System.out.println(a[i]);
            }
        }
    }
    
}
