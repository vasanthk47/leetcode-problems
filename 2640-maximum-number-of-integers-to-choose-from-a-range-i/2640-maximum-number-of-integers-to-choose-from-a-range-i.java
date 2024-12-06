class Solution {
    public int maxCount(int[] b, int n, int maxSum) {
        int f=1,l=n,c=0,k=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        //ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<b.length;i++)
        {
            m.put(b[i],1);
            //t.add(b[i])
        }
        for(int i=1;i<=l;i++)
        {
            if(!m.containsKey(i)){
                c+=i;
                if(c>maxSum)
                return k;
                k++;
            }
          // System.out.println(i+" "+l+" "+(c+i));
        }
      //  System.out.println(f+" "+l+" "+c);
        return k;
    }
}