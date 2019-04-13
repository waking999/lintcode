package easy.e1639ksubstringwithkdifferentcharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int KSubstring(String stringIn, int K) {
        if (stringIn == null) {
            return 0;
        }
        int len = stringIn.length();
        if (len == 0) {
            return 0;
        }
        if (K == 0) {
            return 0;
        }
        if(K>len){
            return 0;
        }

        int[] dup = new int[256];
        Set<String> set = new HashSet<>();

        char[] chars = stringIn.toCharArray();
        int count=0;
        for(int i=0;i<K;i++){
            int idx=getIdx(chars,i);
            if(dup[idx]==0){
                count++;
            }
            dup[idx]++;
        }
        if(count==K){
            set.add(stringIn.substring(0,K));
        }
        for(int i=K;i<len;i++){
            dup[getIdx(chars,i-K)]--;
            if(dup[getIdx(chars,i-K)]==0){
                count--;
            }
            int idx=getIdx(chars,i);
            if(dup[idx]==0){
                count++;
            }
            dup[idx]++;
            if(count==K){
                set.add(stringIn.substring(i-K+1,i+1));
            }
        }


        return set.size();
    }

    private int getIdx(char[] chars,int i){
        return chars[i];
    }
}
