class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int minprod=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           int curr=nums[i];
                if(curr<0)
                {
                    int temp=maxprod;
                    maxprod=minprod;
                    minprod=temp;
                }
            minprod=Math.min(curr,minprod*curr);
            maxprod=Math.max(curr,maxprod*curr);
            res=Math.max(res,maxprod);
        }

        return res;
    }
}