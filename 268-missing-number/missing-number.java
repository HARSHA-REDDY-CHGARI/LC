class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
          for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
          }
          int esum=(n*(n+1))/2;
          return esum-sum;
    }
   
}