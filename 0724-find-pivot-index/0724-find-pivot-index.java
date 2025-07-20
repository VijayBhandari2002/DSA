class Solution {
    public int pivotIndex(int[] nums) {
        int total =0;
        for(int num:nums){
            total+= num;
        }
        int preSum =0;
        for(int pivot = 0;pivot<nums.length;pivot++){
            int suffix = total - preSum - nums[pivot];
            if(preSum == suffix){
                return pivot;
            }
            preSum += nums[pivot];
        }
        return -1;
    }
}