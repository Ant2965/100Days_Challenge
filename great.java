public class great {

    public static void main(String args[]){


        int arr[] ={1,4,2,3,5,7,4,6,3,0};


        for(int i =0;i<arr.length-1;i++){


            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }


        }








    }
    
}
