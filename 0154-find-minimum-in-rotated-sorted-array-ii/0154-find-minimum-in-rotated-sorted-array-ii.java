class Solution {
    public int findMin(int[] arr) {
        if (arr.length == 0) return -1;  // Edge case: empty array
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            // Compare mid with end to determine the direction
            if (arr[mid] < arr[end]) {
                end = mid; // Minimum is in the left half
            } else if (arr[mid] > arr[end]) {
                st = mid + 1; // Minimum is in the right half
            } else {
                // arr[mid] == arr[end], we cannot decide the direction, reduce end
                end--;
            }
        }

        return arr[st];
    }
}