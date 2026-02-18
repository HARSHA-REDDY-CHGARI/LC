class Solution {
    public int maxFreqSum(String s) {
      
        int freq[]=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        int vmaxcount=0;
        int cmaxcount=0;

        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
            {
                continue;
            }
            char ch=(char) ('a'+i);
            if(isvowel(ch))
            {
                vmaxcount=Math.max(vmaxcount,freq[i]);
            }
            else
            {
                cmaxcount=Math.max(cmaxcount,freq[i]);
            }
        }
        return cmaxcount+vmaxcount;
    }

        public boolean isvowel(char c)
        {
            return c=='a' || c=='e' ||c=='i' ||c=='o'|| c=='u'  ;
        
    }
}