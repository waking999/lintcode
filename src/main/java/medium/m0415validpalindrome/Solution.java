package medium.m0415validpalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        // write your code here
        s=s.replaceAll("[,:.?!\\s]","");
        s=s.toLowerCase();
        int len=s.length();
        int l=0;
        int r=len-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
