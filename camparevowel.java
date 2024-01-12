class Solution {
    public boolean halvesAreAlike(String s) {
    int c= s.length();

   int counti=0;

    int countj=0;

    //int mid=s.length()/2;

    for(int i=0,j=s.length()/2;i<s.length()/2 && j<s.length();i++,j++){

        if(vowel(s.charAt(i))){
            counti++;
        }

         if(vowel(s.charAt(j))){
            countj++;
        }


        

           
            
    }
    if(counti!=countj){
            return false;

        }
            return true;

    }


    public static boolean vowel(char a){
        if(a=='a'|| a=='e'||a=='i'||a=='o'||a=='u'||a=='A'|| a=='E'||a=='I'||a=='O'||a=='U'){
            return true;
        }
        return false;
    }






        
}

