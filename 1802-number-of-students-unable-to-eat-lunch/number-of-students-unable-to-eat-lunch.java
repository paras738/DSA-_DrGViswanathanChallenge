class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       



        
        int ones=0;
        int  zeroes=0;


        for(int x:students)
        {
            if(x==0)
            {
                zeroes++;
            }
            if(x==1)
            {
                ones++;
            }
        }


        for(int x:sandwiches)
        {
            if(x==0)
            {
                
                if(zeroes==0)
                {
                    return ones;
                }
                zeroes--;

            }
            else if(x==1)
            {
               
                if(ones==0)
                {
                    return zeroes;
                }
                 ones--;

            }

            
            
        }


        return 0;


        

} 
} 