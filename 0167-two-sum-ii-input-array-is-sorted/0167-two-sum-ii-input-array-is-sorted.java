class Solution {
    public int[] twoSum(int[] n, int target) {
        int a[]=new int[2],n1=n.length;
        for(int i=0;i<n1;i++)
        {
            for(int j=i+1;j<n1;j++)
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