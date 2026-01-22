class Solution {
    public int mySqrt(int n) {
        int lo =1, hi = n;
        while(lo<=hi){
         int mid = lo+(hi-lo)/2;
            if(mid == n/mid) return mid;
            else if(mid > n/mid) hi = mid - 1;
            else lo = mid + 1;
        }
        return hi; 
    }
}