class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int streak = 0;
        int streak_record = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                streak++;
                streak_record = (streak > streak_record) ? streak : streak_record;
            }
            else {
                streak = 0;
            }
        }
        return streak_record;
    }
}
