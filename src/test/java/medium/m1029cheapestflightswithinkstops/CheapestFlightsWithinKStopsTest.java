package medium.m1029cheapestflightswithinkstops;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class CheapestFlightsWithinKStopsTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int n;
        int src;
        int dst;
        int K;
        int[][] flights;
        int expect;
        int output;
        int seq=1;

        n=3;
        flights=new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        src=0;
        dst=2;
        K=0;
        expect=500;
        output=s.findCheapestPrice(n,flights,src,dst,K);
        VerifyUtil.verify(expect,output,seq++);

        n=3;
        flights=new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        src=0;
        dst=2;
        K=1;
        expect=200;
        output=s.findCheapestPrice(n,flights,src,dst,K);
        VerifyUtil.verify(expect,output,seq++);
    }
}
