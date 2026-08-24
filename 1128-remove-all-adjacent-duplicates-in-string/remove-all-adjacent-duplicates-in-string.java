class Solution {

    String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();

       int i=0;
       while(i<s.length())
       {
        if(st.isEmpty())
        {
            st.push(s.charAt(i));
           
        }
        else if(s.charAt(i)==st.peek())
        {
            st.pop();
        }
        else{
            st.push(s.charAt(i));
        }

         i++;

       }
        
         StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
        }
          


        
    }
