class Solution {
    public int maxSubArray(int[] a) {
        if (a.length == 0)
            return Integer.MIN_VALUE;
        else {
            int maxSum = a[0];
            int currentSum = 0;
            for (int i : a) {
                currentSum = Math.max(i, currentSum + i);
                maxSum = Math.max(currentSum, maxSum);
            }
            return maxSum;
        }
    }
}
