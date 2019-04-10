package easy.e0039recoverrotatedsortedarray;

import java.util.List;

public class Solution {
    /**
     * @param nums: An integer array
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        int nLen = nums.size();
        if(nLen<2){
            return;
        }

        while(!(nums.get(nLen-1)<nums.get(nLen-2))){
            Integer val=nums.get(nLen-1);
            nums.remove(nLen - 1);
            nums.add(0,val);
        }
        Integer val=nums.get(nLen-1);
        nums.remove(nLen-1);
        nums.add(0,val);
    }
}
