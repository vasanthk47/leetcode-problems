class Solution {
    public int[] twoSum(int[] n, int target) {
        int a[]=new int[2];
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                int x=n[i]+n[j];
                if(x==target){
                    a[0]=i+1;
                    a[1]=j+1;
                    return a;
                }
            }
        }
        return a;
    }
}