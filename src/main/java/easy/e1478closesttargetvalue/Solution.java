package easy.e1478closesttargetvalue;

import java.util.Arrays;

public class Solution {
    public int closestTargetValue(int target, int[] array) {
        // Write your code here
        if(array==null){
            return -1;
        }
        int len=array.length;
        if(len<2){
            return -1;
        }

        if(target<array[0]){
            return -1;
        }

        Arrays.sort(array);
        if(target>=array[len-1]+array[len-2]){
            return array[len-1]+array[len-2];
        }


        int diff = Integer.MAX_VALUE;
        int l = 0;
        int r = len - 1;
        while (l < r) {
            if (array[l] + array[r] > target) {
                r--;
            } else {
                diff = Math.min (diff, target - (array[l] + array[r]));
                l++;
            }
        }
        if (diff == Integer.MAX_VALUE) {
            return -1;
        } else {
            return target - diff;
        }

    }
}
