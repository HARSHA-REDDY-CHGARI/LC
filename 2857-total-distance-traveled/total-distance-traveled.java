class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int fcons=0;
        int mil=10;
        int dist=0;
        while(mainTank>0)
        {
             fcons=Math.min(mainTank,5);
             dist+=fcons*mil;
             mainTank-=fcons;

             if(fcons%5==0 && additionalTank>0)
             mainTank+=1;
             additionalTank-=1;
        } 
        return dist;
        
    }
}