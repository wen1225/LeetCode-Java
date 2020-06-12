import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> noDupNums = new HashSet<>();
        for (int e : nums) {
            if (!noDupNums.add(e))
                return true;
        }
        return false;
    }
}
