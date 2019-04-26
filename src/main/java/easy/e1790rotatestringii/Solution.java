package easy.e1790rotatestringii;

public class Solution {
    public String RotateString2(String str, int left, int right) {
        // write your code here
        int len=str.length();
        left%=len;
        right%=len;
        if(left==right){
            return str;
        }
        char[] chars=str.toCharArray();
        char[] rtn=new char[len];
        if(left>right){
            left-=right;
            char[] leftChars=new char[left];
            char[] rightChars=new char[len-left];
            System.arraycopy(chars,0,leftChars,0,left);
            System.arraycopy(chars,left,rightChars,0,len-left);

            System.arraycopy(rightChars,0,rtn,0,len-left);
            System.arraycopy(leftChars,0,rtn,len-left,left);
        }else{
            right-=left;
            char[] rightChars=new char[right];
            char[] leftChars=new char[len-right];
            System.arraycopy(chars,0,leftChars,0,len-right);
            System.arraycopy(chars,len-right,rightChars,0,right);

            System.arraycopy(rightChars,0,rtn,0,right);
            System.arraycopy(leftChars,0,rtn,right,len-right);

        }
        return  new String(rtn);
    }

}
