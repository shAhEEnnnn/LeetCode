class Solution {
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int firstMissingPositive(int[] arr) {
       int i=0;
       int n= arr.length;//1 to n
        while(i<n){
            if(arr[i]<=0) i++;
            else if(arr[i]>n ) i++;
            else if(arr[i]==i+1) i++;  
            else if(arr[i]==arr[arr[i]-1]) i++;
            else swap(arr,i,arr[i]-1);   
        }
        for(i=0;i<n;i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }
}