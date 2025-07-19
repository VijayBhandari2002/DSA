class Solution {
    public int largestAltitude(int[] gain) {
        for(int i = 1;i<gain.length;i++){
            gain[i] = gain[i-1] + gain[i];
        }
        int highest = 0;
        for(int i =0;i<gain.length;i++){
            if(gain[i]> highest){
               highest = Math.max(highest,gain[i]);
            }
        }
        return highest;
    }
}