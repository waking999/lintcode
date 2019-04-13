package easy.e1187kdifpairsinanarray;

import java.util.Arrays;

public class Solution {
    public int findPairs(int[] nums, int k) {
        // Write your code here
        Arrays.sort(nums);
        int count=0;
        int l=0;
        int r=1;
        int len=nums.length;
        if(k>0){
            while(r<len){
                while(r<len&&nums[r]==nums[l]){
                    r++;
                }
                if(r>=len){
                    break;
                }
                if(nums[r]-nums[l]==k){
                    count++;
                    l=r;
                    r=l+1;
                }else if(nums[r]-nums[l]<k){
                    int p=r;
                    while(r<len&&nums[r]-nums[l]<k){
                        r++;
                    }
                    if(r>=len){
                        break;
                    }
                    if(nums[r]-nums[l]==k){
                        count++;
                    }
                    l=p;
                    r=l+1;
                }else{
                    l=r;
                    r=l+1;
                }

            }

            return count;
        }
        if(k==0){
            while(l+1<len){
                if(nums[l]==nums[l+1]){
                    count++;
                }
                l++;
                while(l+1<len&&nums[l+1]==nums[l]){
                    l++;
                }

            }
            return count;
        }
        return 0;
    }
}
