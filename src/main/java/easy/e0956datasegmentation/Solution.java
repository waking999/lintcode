package easy.e0956datasegmentation;

public class Solution {
    public String[] dataSegmentation(String str) {
        // Write your code here
        str=str.trim();
        int len=str.length();
        char[] chars=str.toCharArray();
        String[] segs=new String[len];
        int index=0;
        int left=0;
        int right=0;
        while(right<len){
            while(right<len&&isLetter(chars[right])){
                right++;
            }

            int newLen=0;


            if(right<len&&chars[right]!=' '){
                if(left==right){
                    newLen=1;
                }else{
                    newLen=right-left;
                }
            }else{
                newLen=right-left;

            }

            if(newLen>0) {
                char[] seg=new char[newLen];
                System.arraycopy(chars, left, seg, 0, newLen);
                segs[index++] = new String(seg);
            }
            if(right<len&&chars[right]!=' '){
                if(left==right){
                    left=right+1;
                    right=left;
                }else{
                    left=right;
                }
            }else{
                left=right+1;
                right=left;

            }

        }
        String[] rtn=new String[index];
        System.arraycopy(segs,0,rtn,0,index);
        return rtn;


    }

    private boolean isLetter(char c){
        return c>='a'&&c<='z';
    }
}
