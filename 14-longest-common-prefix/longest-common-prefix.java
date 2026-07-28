class Solution {
    public String longestCommonPrefix(String[] strs) {
        String  x=strs[0];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<x.length();i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||strs[j].charAt(i)!=x.charAt(i))
                {
                   return sb.toString();
                }
                

            }
            sb.append(x.charAt(i));
        }
    return sb.toString();}
}
