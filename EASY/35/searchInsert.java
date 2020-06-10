class Solution {
    public int searchInsert(int[] nums, int target) {
        //search for the target first
        int tag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                return i;
            if (target > nums[i])
                tag = i+1;
        }
        return tag;
    }
}
