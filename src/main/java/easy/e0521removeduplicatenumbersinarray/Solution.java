package easy.e0521removeduplicatenumbersinarray;

import java.util.*;

public class Solution {
    public int deduplication(int[] nums) {
        // write your code here


        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        int i = 0;
        for (int n : list) {
            nums[i++] = n;
        }
        return i;
    }


}
