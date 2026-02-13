class Solution {
    public int helper(int[] nums, int target, int lo, int hi) {
        // int n = arr.length;
        // int lo = 0, hi = n-1;
        // while(lo <= hi){
        //     int mid =(lo+hi)/2;
        //     if(arr[mid]==target) return mid;
        //     else if(arr[mid]<target){
        //         lo = mid +1;
        //         else hi = mid -1;

        //     }
            
        // }
        // return -1;
        
        //using recursion
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi);
    }
    public int search(int[] nums,int target){
        int n=nums.length;
        return helper(nums,target,0,n-1);
    }
    
}