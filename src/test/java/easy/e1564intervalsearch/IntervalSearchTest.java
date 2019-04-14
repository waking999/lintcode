package easy.e1564intervalsearch;

import common.Interval;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IntervalSearchTest {
    @Test
    public void test1() {
        Solution s = new Solution();


        List<List<Integer>> intervalLists;
        List<Integer> l1;
        List<Integer> l2;
        List<Integer> l3;
        List<Integer> l4;
        List<Integer> l5;
        List<Integer> l6;
        int number;
        String expect;
        String output;
        int seq = 1;

        intervalLists = new ArrayList<>();
        l1 = new ArrayList<>();
        l1.add(100);
        l1.add(1100);
        intervalLists.add(l1);
        l2 = new ArrayList<>();
        l2.add(2000);
        l2.add(3000);
        intervalLists.add(l2);
        l3 = new ArrayList<>();
        l3.add(2500);
        l3.add(3500);
        intervalLists.add(l3);
        number = 3300;
        expect = "True";
        output = s.isInterval(intervalLists, number);
        VerifyUtil.verify(expect, output, seq++);


        intervalLists = new ArrayList<>();
        l1 = new ArrayList<>();
        l1.add(-660912);
        l1.add(-659912);
        intervalLists.add(l1);
        l2 = new ArrayList<>();
        l2.add(-701809);
        l2.add(-700809);
        intervalLists.add(l2);
        l3 = new ArrayList<>();
        l3.add(4596);
        l3.add(5596);
        intervalLists.add(l3);
        l4 = new ArrayList<>();
        l4.add(232048);
        l4.add(233048);
        intervalLists.add(l4);
        l5 = new ArrayList<>();
        l5.add(546060);
        l5.add(547060);
        intervalLists.add(l5);
        l6 = new ArrayList<>();
        l6.add(790551);
        l6.add(791551);
        intervalLists.add(l6);

        number = -701234;
        expect = "True";
        output = s.isInterval(intervalLists, number);
        VerifyUtil.verify(expect, output, seq++);

    }
}
