package easy.e0060searchinsertposition;

public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return An integer
     */
    public int searchInsert(int[] A, int target) {


        // write your code here
        int aLen=A.length;
        if(aLen==0){
            return 0;
        }


        if(target<=A[0]){
            return 0;
        }

        if(target>A[aLen-1]){
            return aLen;
        }
        return getFirstSmallestPos(A,0,aLen-1,target);
    }

    private int getFirstSmallestPos(int[] A,int l,int r,int target){
        while(l+1<r){
            int m=l+(r-l)/2;
            if(target>A[m]){
                l=m;
            }else if(target<=A[m]){
                r=m;
            }
        }
        return r;

    }
}
