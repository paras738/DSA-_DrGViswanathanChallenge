class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int count=0;
         

        List<Character>li= new ArrayList<>();


       for(int i=0;i<ransomNote.length();i++)
       { 
        li.add(ransomNote.charAt(i));


        
       }

       for(int i=0;i<magazine.length();i++)
       { 
          if(li.contains(magazine.charAt(i)));
          {
            li.remove(Character.valueOf(magazine.charAt(i)));
          }

        if (li.isEmpty())
        {
            return true;
        }
        
       }

   return false; } 
}