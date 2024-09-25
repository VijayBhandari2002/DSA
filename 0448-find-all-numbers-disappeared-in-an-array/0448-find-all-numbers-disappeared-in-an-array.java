class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for(int i : nums) arr[i] = true;

        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            if(!arr[i]) ans.add(i);
        }

        return ans;
    }
}