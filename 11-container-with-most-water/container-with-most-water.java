class Solution {
    public int maxArea(int[] a) {
        int l=0;
        int r=a.length-1;
        int m=0;
        for(int i=0;i<a.length;i++){
            int c=Math.min(a[l],a[r])*(r-l);
            m=Math.max(c,m);
            if(a[l]<a[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return m;
        
    }
}