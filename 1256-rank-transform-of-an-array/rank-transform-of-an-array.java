class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[][] a = new int[n][3];
        for (int i=0;i<n;i++) {
            a[i][0] = arr[i];
            a[i][1] = i;
        }
        Arrays.sort(a, (a1,b1)-> a1[0]-b1[0]);
        int c = 0;
        for (int i=0;i<n;i++) {
            if ((i>0) && (a[i][0]!=a[i-1][0])) {
                c++;    
            }
            a[i][2] = c+1;
        }
        Arrays.sort(a, (a1,b1)-> a1[1]-b1[1]);
        for (int i=0;i<n;i++) {
            arr[i] = a[i][2];
        }
        return arr;
    }
}