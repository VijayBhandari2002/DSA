class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Two pointers for the result array: one for positives and one for negatives
        int posIndex = 0;
        int negIndex = 1;
        
        // Traverse through the input array
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2; // Move to the next position for positive number
            } else {
                result[negIndex] = num;
                negIndex += 2; // Move to the next position for negative number
            }
        }
        
        return result;
    }
}