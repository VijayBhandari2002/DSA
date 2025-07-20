class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int result =0;
        int preSum =0;
        int even =1 , odd =0;

        for(int num : arr){
            preSum += num;

            if(preSum % 2 ==0){
                result = (result + odd) % MOD;
                even++;
            }else{
                result = (result + even) % MOD;
                odd++;
            }
        }
        return result;
    }
}