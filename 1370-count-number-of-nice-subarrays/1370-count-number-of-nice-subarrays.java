class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int oddCount =0;
        map.put(0,1);

        for(int num:nums){
            if(num % 2==1){
                oddCount++;
            }
            count+= map.getOrDefault(oddCount-k,0);
            map.put(oddCount,map.getOrDefault(oddCount,0)+1);

        }
        return count;
    }
}