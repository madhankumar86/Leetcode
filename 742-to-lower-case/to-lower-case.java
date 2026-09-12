class Solution {
    public String toLowerCase(String s) {
        char [] a=s.toCharArray();
        for(int i=0;i<s.length();i++){
            a[i]=Character.toLowerCase(a[i]);

        }
        return new String(a);
    }
}