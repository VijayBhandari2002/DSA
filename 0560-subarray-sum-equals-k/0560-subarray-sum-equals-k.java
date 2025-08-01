class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0; 
        int sum =0;
        map.put(0,1);
        for(int num : nums){
            sum += num;
            int rem = sum -k;
            if(map.containsKey(rem)){
                count+= map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}