class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            int rem = sum % k;

            if(map.containsKey(rem) && i - map.get(rem) >=2){
                return true;
            }
            map.putIfAbsent(rem,i);
        }
        return false;
    }
}