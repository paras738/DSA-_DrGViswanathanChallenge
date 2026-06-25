class Solution {
    public int[] finalPrices(int[] prices) {
        
        int l=prices.length;
        Stack<Integer>st=new Stack<>();
        int arr[]=new int[l];

        for(int i=l-1;i>=0;i--)
        {
            int x=prices[i];
        
        while(!st.isEmpty() && prices[i]<st.peek())
        {
            st.pop();
        }
          

          if(st.isEmpty())
          {
            st.push(x);
             arr[i]=prices[i];
          }
          else
          {
            if(prices[i]<st.peek())
            {
                   arr[i]=prices[i];
            }
            else
            {
                arr[i]=prices[i]-st.peek();
            }
          }


          st.push(x);




        }
    return arr;}
}