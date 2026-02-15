class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int ind=0;
       int n=nums.length;
       int res[]=new int[n];
       for(int ele :nums)
       {
        if(ele<pivot)
            res[ind++]=ele;
       }
        for(int ele :nums)
        {
        if(ele==pivot)
            res[ind++]=ele;
        }
        for(int ele :nums)
        {
        if(ele>pivot)
            res[ind++]=ele;
        }
        
        return res;
    }
}