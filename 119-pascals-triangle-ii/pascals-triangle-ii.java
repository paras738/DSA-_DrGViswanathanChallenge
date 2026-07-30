class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>list= new ArrayList<>();
       
       
        for(int j=0;j<=rowIndex;j++)
        {
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int i=1;i<j;i++)
           {
            int val=list.get(j-1).get(i)+list.get(j-1).get(i-1);
            row.add(val);
            }
        

                if(j>0)
             {
                  row.add(1);
                }
                list.add(row);
        }
      return list.get(rowIndex); }
}