class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {

        HashMap<String,List<Integer>> map= new HashMap<>();

        List<String>ans =new ArrayList<>();



        for(int i=0;i<access_times.size();i++){

            String cus = access_times.get(i).get(0);
            String time = access_times.get(i).get(1);



            if(!map.containsKey(cus)){

                map.put(cus,new ArrayList<>());
            }

            int t =Integer.parseInt(time);
            map.get(cus).add(t);

        }

        for(String emp:map.keySet()){
            List<Integer> times=map.get(emp);
            Collections.sort(times);

            if(high(times)){
                ans.add(emp);

            }

            

            

        }



        return ans;
        
    }

    public static boolean high(List<Integer>time){
        int n =time.size();

        for(int i=2;i<n;i++){
            int curr=time.get(i);
            int prev = time.get(i-2);

            if(prev+99>=curr){
                return true;
            }
        }
        return false;
    }
}