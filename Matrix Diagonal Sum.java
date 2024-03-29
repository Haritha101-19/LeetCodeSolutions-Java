class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        for(int i=0,j=mat.length-1;i<mat.length && j>=0;i++,j--){
            if(i!=j){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}
