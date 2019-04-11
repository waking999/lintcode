package easy.e1663depress;

import java.util.Arrays;

public class Solution {
    public String depress(int m, int k, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum<m){
            return "yes";
        }
        return "no";
    }
}
