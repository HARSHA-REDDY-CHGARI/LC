class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder resstr=new StringBuilder();
        for(int i=0;i<word1.length() || i<word2.length() ;i++){
            if(i<word1.length()){
                resstr.append(word1.charAt(i));
            }
             if(i<word2.length()){
                resstr.append(word2.charAt(i));
            }
        }
        return resstr.toString();
        
    }
}