public class spiral {





    public static void printmatrix(int mat[][]){
        int startrow=0;
        int startcol=0;
        int endrow=mat.length-1;
        int endcol=mat[0].length-1;


        while(startrow<=endrow&&startcol<=endcol){
             for(int j= startcol;j<endcol;j++){
                System.out.print(mat[startrow][j]);
             }


             for(int i=startrow+1;i<endrow;i++){
                System.out.print(mat[i][endcol]);
             }

             for(int j=endcol-1;j>=startcol;j--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(mat[endrow][j]);
             }

             for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(mat[i][startcol]);
             }

             startcol++;
             startrow++;
             endcol--;
             endrow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int mat [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printmatrix(mat);
    }
    
}
