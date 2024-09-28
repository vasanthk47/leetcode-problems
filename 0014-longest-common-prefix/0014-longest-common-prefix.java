class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        int c=0;
        int n=0,m=strs[0].length();
        for(String p:strs)
        {
            n++;
            m=(m>p.length())?p.length():m;
            s=(s.length()>p.length())?p:s;
        }
        int u=0;
        String a="";
        for(char i:s.toCharArray())
        {
            System.out.println(i);
             c=0;
             int f=0;
            while(u<m && f<n)
            {
                String h=strs[f];
                if(i==h.charAt(u))
                c++;
                ++f;
            }
            if(c==n)
            {
                a=a+i;
            }
            else
            {
                break;
            }
            u++;   
        }
        return a;
    }
}