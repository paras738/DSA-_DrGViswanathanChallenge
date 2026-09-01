class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        

       List<Integer>li=new ArrayList<>();
     


        for(int i=0;i<nums.length;i++)
        {
          int x=Math.abs(nums[i]);
          nums[x-1]=-Math.abs(nums[x-1]);
          

          
        }

          for(int i=0;i<nums.length;i++)
        {
         if(nums[i]>0)
         {
            li.add(i+1);
         }
        }
       

        return li;
    }
}