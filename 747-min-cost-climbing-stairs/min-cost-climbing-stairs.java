class Solution {
    public int minCostClimbingStairs(int[] cost) {
         


         int cot[]=new int[cost.length+1];

         int n=cost.length;
         if(n==0)
         {
            return 0;
         }
         else if(n==1)
         {
            return 0;
         }
         else if(n==2)
         {
             return Math.min(cost[0],cost[1]);
         }
         else
         {
        cot[0]=0;
         cot[1]=0;
         cot[2]=Math.min(cost[0],cost[1]);
         for(int i=3;i<=cost.length;i++)
         {
             cot[i]=Math.min((cost[i-1]+cot[i-1]),(cost[i-2]+cot[i-2]));

         }
         }
         return cot[cost.length];
    }
}