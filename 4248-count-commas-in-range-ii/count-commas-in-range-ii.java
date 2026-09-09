class Solution {
    public long countCommas(long n) {
         long count = 0;
        
        for (long x = 1000; x <= n; x *= 1000) {
            count += n - x + 1;
            
            if (x > n / 1000)
                break;
        }
        
        return count;
    }
}