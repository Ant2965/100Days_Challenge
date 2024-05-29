import java.util.ArrayList;

public class maximumwater {
    public static void main(String[] args) {
        
        ArrayList<Integer> a =new ArrayList<>();


        a.add(2);
        a.add(8);
        a.add(6);
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(8);
        a.add(3);
        a.add(7);

        System.out.println(maxwater(a));

    }

    public static int maxwater(ArrayList<Integer> a) {
        int maxw=0;
        int lp=0;
        int rp=a.size()-1;

        while(rp>lp){
            int ht =Math.min(a.get(lp),a.get(rp));
            int widht= rp-lp;
            int currwater = ht*widht;
            maxw=Math.max(maxw, currwater);

            if(a.get(lp)<a.get(rp)){
                lp++;
            }else{
                rp--;
            }




        }

        return maxw;


        
    }
    
}
