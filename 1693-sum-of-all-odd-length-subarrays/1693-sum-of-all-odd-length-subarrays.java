class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum =0;

        for(int i =0;i<n;i++){
            int total = (i+1)*(n-i);
            int oddCount = total/2;

            if(total%2==1) oddCount++;
            totalSum += oddCount * arr[i];
        };
        return totalSum;
    }
}