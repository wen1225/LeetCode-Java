class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num_of_digits = 0;
            while (nums[i] != 0) {
                num_of_digits++;
                nums[i] /= 10;
            }
            sum += (num_of_digits % 2 == 0) ? 1 : 0;
        }
        return sum;
    }
}
