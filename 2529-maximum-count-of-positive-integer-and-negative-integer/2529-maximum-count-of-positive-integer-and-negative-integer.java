class Solution {
    public int maximumCount(int[] nums) {
    int n = nums.length;

    int firstNonNegative = lowerBound(nums, 0);
    int firstPositive = lowerBound(nums, 1);

    int neg = firstNonNegative;
    int pos = n- firstPositive;
    return Math.max(neg, pos);
    }
    private int lowerBound(int[] arr, int target){
        int lo = 0, hi = arr.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<target){
                lo = mid + 1;
            }
            else{
                hi = mid;

            }
        }
        return lo;
    }
}