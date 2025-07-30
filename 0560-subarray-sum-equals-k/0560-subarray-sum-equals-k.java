class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum =0; 
        int count=0;

        map.put(0,1);
        for(int num:nums){
            preSum += num;
            int rem = preSum -k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}