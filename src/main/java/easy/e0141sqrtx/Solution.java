package easy.e0141sqrtx;

public class Solution {
    public int sqrt(int x) {
        if(x==0){
            return 0;
        }
        if(x<=3){
            return 1;
        }
        // write your code here
        int l=1;
        int r=x;
        while(l<r){
            int m=l+(r-l)/2;

            int v=x/m;
            if(v==m){
                return m;
            }else if(v>m){
                l=m+1;
                r=v;
            }else{
                r=m-1;
                l=v;
            }

        }
        if(l*l>x) {
            return l-1;
        }
        return l;
    }
}
