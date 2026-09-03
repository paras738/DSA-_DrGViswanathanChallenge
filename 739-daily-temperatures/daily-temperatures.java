class Solution {
    public int[] dailyTemperatures(int[] temperature) {
        

       int arr[]=new int[temperature.length];
       Stack<Integer>st=new Stack<>();


       for(int i=temperature.length-1;i>=0;i--)
       {
         while(!st.isEmpty()&&temperature[i]>=temperature[st.peek()])
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