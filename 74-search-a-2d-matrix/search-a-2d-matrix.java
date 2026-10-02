class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int rows = m.length;
        int cols = m[0].length;

        int l=0;
        int r=rows*cols-1;
        while(l<=r){
            int a=l+(r-l)/2;
            int row = a / cols;
            int col = a % cols;


            if(m[row][col]==target){
                return true;
            }else if(m[row][col]<target){
                l=a+1;
            }else if(m[row][col]>target){
                r=a-1;
            } else {
                r =a - 1;
            }
        }
        return false;
        
    }
}