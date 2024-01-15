class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>>ans =new ArrayList<>();
        List<Integer>temp=new ArrayList<>();

        combi(1,9,k,n,temp,ans);

        return ans;

        
    }


    public static void combi(int start, int end,int k,int n, List<Integer>temp,List<List<Integer>>ans){
        if(n==0&&temp.size()==k){
            ans.add(new ArrayList(temp));
            return;
        }

        for(int i=start;i<=end;i++){
            temp.add(i);
            combi(i+1,end,k,n-i,temp,ans);
            temp.remove(temp.size()-1);
        }

    }
}
