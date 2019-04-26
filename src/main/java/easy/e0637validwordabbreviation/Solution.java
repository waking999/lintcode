package easy.e0637validwordabbreviation;

public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        // write your code here
        int wLen = word.length();
        int aLen = abbr.length();
        char[] wChars = word.toCharArray();
        char[] aChars = abbr.toCharArray();

        int wp = 0;
        int apL = 0;
        int apR = 0;

        if(wChars[0]!=aChars[0]){
            return false;
        }

        while (wp < wLen && apR < aLen) {

            if (wChars[wp] == aChars[apL]) {
                apL++;
                wp++;
            }else if(isDigit(aChars[apL])){
                apR=apL;
                while (apR < aLen && isDigit(aChars[apR])) {
                    apR++;
                }

                int count = getNum(aChars, apL , apR - 1);
                wp += count;
                apL = apR;

            }else{
                return  false;
            }

        }
        return (wp == word.length()) && (apL == abbr.length());
    }

//    private boolean isLetter(char c) {
//        return c >= 'a' && c <= 'z';
//    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private int getNum(char[] aChars, int left, int right) {
        int rtn = 0;
        for (int i = left; i <= right; i++) {
            rtn = rtn * 10 + (aChars[i] - '0');
        }
        return rtn;
    }
}
