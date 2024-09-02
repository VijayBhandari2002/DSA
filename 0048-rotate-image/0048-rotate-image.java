import java.util.Arrays;
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<m;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end= m-1;
            while(start<=end){
                int temp = matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]= temp;
                start++;
                end--;
            }
        }
    }
}