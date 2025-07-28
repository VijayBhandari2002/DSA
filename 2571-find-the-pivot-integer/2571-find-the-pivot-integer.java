class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int temp =0;
        for(int i =0;i<=n;i++){
            sum -= i;
            if(sum == temp){
                return i;
            }
            temp += i;
        }
        return -1;
    }
}