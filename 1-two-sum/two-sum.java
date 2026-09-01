class Solution {
    public int[] twoSum(int[] nums, int target) {

   Map<Integer,Integer>map=new HashMap<>();
   int arr[]={-1,-1};

   for(int i=0;i<nums.length;i++)

   { 
    

    if(map.containsValue(target-nums[i]))
    {
        

        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==(target-nums[i]))
            {
                arr[0]=entry.getKey();
                  arr[1]=i;

                  return arr;

            }
            
        }
        
        
    }
    else
    {
           map.put(i,nums[i]);
    }
    

   }

   return arr;


   
       
}
}
