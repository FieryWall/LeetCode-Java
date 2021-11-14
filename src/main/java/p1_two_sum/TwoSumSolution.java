package p1_two_sum;

import java.util.HashMap;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        Integer[] r = new Integer[]{0, 0};
        while((r[0] = d.get(target - nums[r[1]])) == null) {
            d.put(nums[r[1]], r[1]++);
        }
        return new int[]{r[0], r[1]};
    }
}
