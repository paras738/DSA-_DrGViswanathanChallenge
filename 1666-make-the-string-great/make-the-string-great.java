class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
      StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {    char ch=s.charAt(i);
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
                continue;
            }


            if(Character.isLowerCase(ch)&&Character.toUpperCase(ch)==st.peek())
            {
                st.pop();

            }
            else if(Character.isUpperCase(ch)&&Character.toLowerCase(ch)==st.peek())
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }


        while(!st.isEmpty())
        {
            str.append(st.pop());
        }
   return str.reverse().toString(); }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        