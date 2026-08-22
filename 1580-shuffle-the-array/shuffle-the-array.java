class Solution {
    public int[] shuffle(int[] nums, int n) {
        

        for(int i=1;i<nums.length&&(n<nums.length);i=i+2)
        {
            int val=nums[n];
            for(int j=n;j>i;j--)
            {
                nums[j]=nums[j-1];
            }

            nums[i]=val;
            n++;
        }
   return nums; }
}