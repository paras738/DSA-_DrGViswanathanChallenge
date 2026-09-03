class Solution {
    public int[] dailyTemperatures(int[] temperature) {
        

        Stack<Integer>st=new Stack<>();
        int arr[]=new int[temperature.length];

         
    for(int i=temperature.length-1;i>=0;i--)
    {
         

       
    
        while(!st.isEmpty()&&temperature[st.peek()]<=temperature[i])
        {
               st.pop();
               

              
        }

        if(!st.isEmpty())
        {
            arr[i]=st.peek()-i;
        }

      
        
    
       
        
       st.push(i);
    }



   return arr; }
}