class Solution {
    public boolean isSubsequence(String s, String t) {
        int c=0,p=0;
        for(int i=0;(i<t.length() && s.length()>p);i++)
        {
            if(s.charAt(p)==t.charAt(i))
            {
                p++;
                c++;
            }
        }
            if(c!=s.length())
            return false;
        
        return true;
    }
}