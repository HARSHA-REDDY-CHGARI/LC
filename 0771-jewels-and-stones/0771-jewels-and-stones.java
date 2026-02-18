class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jset=new HashSet<>();
        for(char ch:jewels.toCharArray())
        {
            jset.add(ch);
        }
        int count=0;
        for(char st:stones.toCharArray())
        {
            if(jset.contains(st))
            {
                count++;
            }
        }
      return count;  
    }
}