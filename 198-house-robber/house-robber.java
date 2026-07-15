class Solution {
    public int rob(int[] nums) {

        int n=nums.length;
        int maxloot[]=new int[n];
        if(n==1)
        {
            return nums[0];
        }
        maxloot[0]=nums[0];
        maxloot[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++)
        {
           
           int skip=maxloot[i-1];
           int loot=nums[i]+maxloot[i-2];


           maxloot[i]=Math.max(skip,loot);
        }

        
    return maxloot[n-1];}
}