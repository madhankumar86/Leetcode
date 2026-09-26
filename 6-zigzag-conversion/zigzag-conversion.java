class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        String []b=new String[numRows];
        for(int i=0;i<b.length;i++){
            b[i]="";
        }
        int cr=0;
        boolean g=false;
        for(char ch:s.toCharArray()){
            b[cr]+=ch;
            if(cr==0||cr==numRows-1){
                g=!g;
            }
            cr+=g?1:-1;
        }
        String r="";
        for(String  d:b){
            r += d;
        }
        return r;
        }
}
