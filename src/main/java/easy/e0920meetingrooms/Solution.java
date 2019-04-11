package easy.e0920meetingrooms;

import common.Interval;

import java.util.List;

public class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        int len=intervals.size();
        for(int i=0;i<len-1;i++){
            Interval i1=intervals.get(i);
            for(int j=i+1;j<len;j++){
                Interval i2=intervals.get(j);
                if(i1.start<i2.start) {
                    if (i1.end > i2.start) {
                        return false;
                    }
                }else{
                    if(i2.end>i1.start){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
