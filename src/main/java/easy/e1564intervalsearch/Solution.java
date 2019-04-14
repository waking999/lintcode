package easy.e1564intervalsearch;

import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param intervalList:
     * @param number:
     * @return  return True or False
     */
    public String isInterval(List<List<Integer>> intervalList, int number) {
        // Write your code here
        if(intervalList==null){
            return "False";
        }

        int len=intervalList.size();

        W[] start=new W[len];
        W[] end=new W[len];

        for(int i=0;i<len;i++){
            List<Integer> list=intervalList.get(i);
            start[i]=new W(list.get(0),i);
            end[i]=new W(list.get(1),i);

        }
        Arrays.sort(start);
        Arrays.sort(end);

        int p1=getLastSmaller(start,0,len-1,number);
        if(p1==-1){
            return "False";
        }
        int p2=getFirstLarger(end,0,len-1,number);
        if(p2==-1){
            return "False";
        }
        if(start[p1].idx==end[p2].idx){
            return "True";
        }
        return "False";
    }

    private class W implements Comparable<W>{
        int val;
        int idx;

        W(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(W o){
            return this.val-o.val;
        }
    }
    private int getLastSmaller(W[] start,int l,int r,int target){
        while(l<r){
            int m=l+(r-l)/2;
            if(target==start[m].val){
                return m;
            }if(target>start[m].val){
                if(m+1<start.length&&target>start[m+1].val) {
                    l = m + 1;
                }else{
                    return m;
                }
            }else{
                r=m-1;
            }
        }
        if(start[l].val<=target){
            return l;
        }
        return -1;
    }

    private int getFirstLarger(W[] end,int l,int r,int target){
        while(l<r){
            int m=l+(r-l)/2;
            if(target==end[m].val){
                return m;
            }if(target<end[m].val){
                if(m-1>=0&&target<end[m-1].val){
                    r=m-1;
                }else{
                    return m;
                }
            }else{
                l=m+1;
            }
        }
        if(end[r].val>=target){
            return r;
        }
        return -1;
    }
}
