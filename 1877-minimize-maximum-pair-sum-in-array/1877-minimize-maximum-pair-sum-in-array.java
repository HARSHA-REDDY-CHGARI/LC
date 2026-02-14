class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++){
            int currsum=nums[i]+nums[n-1-i];
        
        maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;

    }
}