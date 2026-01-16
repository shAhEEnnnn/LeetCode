class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length, n=arr[0].length;
        int i = 0, j = n-1;
        while(i<m && j>=0){
            if(arr[i][j]>target) j--;
            else if(arr[i][j]<target)i++;
            else return true;
        }
      //  for(int i=0;i<matrix.length;i++){ //TC =O(m*n)
        //    for(int j=0;j<matrix[0].length;j++){
          //      if(matrix[i][j]==target) return true;
           // }
      //  }
        return false;
    }
}