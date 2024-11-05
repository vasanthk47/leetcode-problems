class Solution {
    public int findJudge(int n, int[][] trust) {
        int a,b;
        int in[]=new int[n+1],ou[]=new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            a=trust[i][0];
            b=trust[i][1];
            in[b]++;
            ou[a]++; 
        }
        int ans=-1;
        for(int i=1;i<n+1;i++)
        {
             if(in[i]==n-1 && ou[i]==0)
             ans= i;
        }
        return ans;
    }
}