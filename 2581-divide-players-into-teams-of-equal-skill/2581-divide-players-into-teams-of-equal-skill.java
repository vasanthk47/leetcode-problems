class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        if (n<2 || n%2!=0){
            return -1;
        }
        if (n==2){
            return skill[0]*skill[1];
        }
        int TotalSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i: skill){
            TotalSum+=i;
            int a = map.getOrDefault(i,0);
            map.put(i,a+1);
        }

        if ((TotalSum*2)%n!=0){
            return -1;
        }
        int sum = (TotalSum*2)/n;
        long chemistry = 0;
        for (int i: skill){
            int c = map.get(i);
            if (c==0){
                continue;
            }
            map.put(i,c-1);
            int a = sum-i;
            int b = map.getOrDefault(a,0);
            if (b>0){
                map.put(a,b-1);
                chemistry+=(a*i);
            }
            else{
                return -1;
            }
        }
        return chemistry;
    }
}