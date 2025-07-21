class Solution {
    public int minStartValue(int[] nums) {
        int preSum =0;
        int miniPreSum =0;

        for(int i =0;i<nums.length;i++){
            preSum += nums[i];
            miniPreSum = Math.min(miniPreSum,preSum);
        }
        return 1-miniPreSum;
    }
}