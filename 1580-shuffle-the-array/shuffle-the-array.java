class Solution {
    public int[] shuffle(int[] nums, int n) {
        
   int arr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2!=0)
            {
                arr[i]=nums[n];
                n++;
                
            }
            else
            {
                arr[i]=nums[j];
                 j++;
            }
           
     
        }

        return arr;}
}