class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        if(nums.length == 0){
            return 0;
        }
        int longest =1;
        for(int i=0;i<nums.length;i++){
            result.add(nums[i]);
        }
        for(int it:result){
            if(!result.contains(it-1)){
                int cnt =1;
                int x =it;
                while(result.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}