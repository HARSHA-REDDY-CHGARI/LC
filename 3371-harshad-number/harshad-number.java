class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
    int ogx=x;
     int sum=0;
        while(x>0)
        {
           
            sum +=x%10;
            x=x/10;
        }
        
        if(ogx%sum==0){
            return sum;
        }
       
        
        return -1;
       
        
    }
    
}