class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        int []p=new int[n];
        for(int i=0;i<n;i++)
        {
            p[nums[i]-1]++;
        }
        for(int i=0;i<n;i++)
        {
            if(p[i]==0)
            l.add(i+1);
        }
        return l;
    }
}