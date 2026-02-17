class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<Integer>();
        for(int fr:friends)
        {
            set.add(fr);
        }
        int res[]=new int[friends.length];
        int ind=0;
        for(int ele :order)
        {
            if(set.contains(ele))
            {
                res[ind++]=ele;
            }
        }
        return res;
    }
}