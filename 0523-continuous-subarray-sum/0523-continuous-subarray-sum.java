class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++){
            sum += nums[i];

            int reminder = sum % k;

            if(map.containsKey(reminder) && i - map.get(reminder)>=2){
                return true;
            }
            map.putIfAbsent(reminder,i);
        }
        return false;
    }
}