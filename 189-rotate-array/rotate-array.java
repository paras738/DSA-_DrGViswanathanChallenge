class Solution {
    public void rotate(int[] nums, int k) {
           
          k=k%nums.length;
           rotation(0,nums.length-1,nums);
           rotation(0,k-1,nums);
           rotation(k,nums.length-1,nums);



    }



     public void rotation(int start,int end,int nums[])
           {
            while(start<end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;

                start++;
                end--;
            }

            
           }


   
}