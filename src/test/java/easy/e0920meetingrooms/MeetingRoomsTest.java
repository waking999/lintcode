package easy.e0920meetingrooms;

import common.Interval;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomsTest {

    @Test
    public void test1(){
        Solution s=new Solution();

        List<Interval> intervals;
        boolean expect;
        boolean output;
        int seq=1;

        intervals=new ArrayList<>();
        intervals.add(new Interval(0,30));
        intervals.add(new Interval(5,10));
        intervals.add(new Interval(15,20));
        expect=false;
        output=s.canAttendMeetings(intervals);
        VerifyUtil.verify(expect,output,seq++);


        intervals=new ArrayList<>();
        intervals.add(new Interval(5,8));
        intervals.add(new Interval(9,15));
        expect=true;
        output=s.canAttendMeetings(intervals);
        VerifyUtil.verify(expect,output,seq++);

        intervals=new ArrayList<>();
        intervals.add(new Interval(465,497));
        intervals.add(new Interval(386,462));
        intervals.add(new Interval(354,380));
        intervals.add(new Interval(134,189));
        intervals.add(new Interval(199,282));
        intervals.add(new Interval(18,104));
        intervals.add(new Interval(499,562));
        intervals.add(new Interval(4,14));
        intervals.add(new Interval(111,129));
        intervals.add(new Interval(292,345));
        expect=true;
        output=s.canAttendMeetings(intervals);
        VerifyUtil.verify(expect,output,seq++);




    }
}
