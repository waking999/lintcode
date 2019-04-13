package easy.e1638leastsubstring;

public class Solution {
    public int getAns(String s, int k) {
        // Write your code here
        if(s==null){
            return 0;
        }
        int len=s.length();
        if(len==0){
            return 0;
        }
        if(k==0){
            return 0;
        }
        if(k==1){
            return len;
        }

        char[] chars=s.toCharArray();

        int l=0;

        int allcount=0;
        while(l<len){
            int count=1;
            while(count<k&&l+1<len&&chars[l]==chars[l+1]){
                count++;
                l++;
            }
            if(l>=len){
                break;
            }
            allcount++;
            l++;
        }
        return allcount;
    }
}
