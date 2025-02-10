class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isself(i))
            {
            list.add(i);
            }
        }
        return list;
    }
    public  boolean isself(int i)
    {
        int orgnum =i;
        while(i>0)
        {
           int  digit=i%10;
            if(digit ==0 || orgnum%digit !=0)
            {
                return false;
            }
            i/=10;
        }
        return true;
    }
}