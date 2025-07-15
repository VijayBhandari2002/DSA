class Solution {
    public int singleNumber(int[] nums) {
        int initial = nums[0];

        for(int i=1; i<nums.length;i++){
            initial = initial ^ nums[i];
        }
        return initial;
    }
}