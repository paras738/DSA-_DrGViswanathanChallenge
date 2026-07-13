class Solution {
    public int findGCD(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int num:nums)
        {
            max=Math.max(num,max);
            min=Math.min(num,min);

          
            
           
        }
          if(max%min==0)
            {
                return min;
            }



            for(int i=max;i>0;i--)
            {
                if(min%i==0&&max%i==0)
                {
                    return i;
                }
            }
   return 1; }
}