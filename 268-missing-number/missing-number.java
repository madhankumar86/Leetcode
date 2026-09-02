class Solution {
    public int missingNumber(int[] nums) {
        int c=0;
       int n=nums.length;
       int a=n*(n+1)/2;
       for(int b:nums){
        c+=b;
       }
       return a-c;
        
        
    }
}