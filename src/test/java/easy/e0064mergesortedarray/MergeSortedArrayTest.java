package easy.e0064mergesortedarray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    @Test
    public void test1(){
        Solution s=new Solution();
        int[] A;
        int[] A1;
        int m;
        int[] B;
        int n;
        int[] expect;
        int[] output;
        int seq=1;


        A=new int[10000];
        A1=new int[]{1,3,4,6};
        m=4;
        System.arraycopy(A1, 0, A, 0, m);
        B=new int[]{2,5};
        n=2;
        expect=new int[]{1,2,3,4,5,6};
        s.mergeSortedArray(A,m,B,n);
        output=new int[m+n];
        System.arraycopy(A,0,output,0,m+n);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
