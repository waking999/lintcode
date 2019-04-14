package easy.e0604windowsum;

public class Solution {
    public int[] winSum(int[] nums, int k) {
        // write your code here
        int len=nums.length;
        int newLen=len-k+1;
        int[] rtn=new int[newLen];
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        rtn[0]=sum;
        for(int i=k;i<len;i++){
            rtn[i-k+1]=rtn[i-k]-nums[i-k]+nums[i];
        }
        return rtn;
    }

}
