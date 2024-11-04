class Solution {
    public String compressedString(String w) {
        int n=w.length(),i=0;
        String s="";
        while(i<n)
        {
            int c=1,j=i+1;
            char a=w.charAt(i);
            while(j!=n&&a==w.charAt(j))
            {
                    c++;
                    j++;
            }
            while(c>9)
            {
                s=s+'9'+a;
                c=c-9;
            }
            s=s+c+a;
            i=j;
        }
        return s;
    }
}