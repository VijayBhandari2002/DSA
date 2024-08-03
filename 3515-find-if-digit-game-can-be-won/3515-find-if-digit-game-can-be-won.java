class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOfSingleDigits =0;
        int sumOfDoubleDigits =0;
        for (int i =0;i<nums.length;i++){
            if(nums[i]<10){
                sumOfSingleDigits += nums[i];
            }else if (nums[i]>9){
                sumOfDoubleDigits += nums[i];
            }
        }
        return sumOfSingleDigits != sumOfDoubleDigits;
    }   
}