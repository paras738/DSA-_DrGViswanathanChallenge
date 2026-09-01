class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j=0;
        int i=0;
        while(j<nums.length)
        {
            if(nums[j]!=val)
            {  
                nums[i]=nums[j];
               i++;
               j++;
            }

            else
            {
               
               j++;

            }
        }
       
    return i; }
}