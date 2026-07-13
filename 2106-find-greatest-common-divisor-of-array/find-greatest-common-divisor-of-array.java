class Solution {
    public int findGCD(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int num:nums)
        {
            max=Math.max(num,max);
            min=Math.min(num,min);

          
            
           
        }
         
       

           
   return gcd(min,max); }

   public int gcd( int min,int max)
       {
        while(min!=0)
        {
        int x=max%min;
        max=min;
        min=x;

       

       }
        return max;
       }




}