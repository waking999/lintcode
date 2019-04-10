package easy.e0064mergesortedarray;

public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(A[i]<=B[j]){
                i++;
            }else{
                if (m - i >= 0) System.arraycopy(A, i, A, i + 1, m - i);
                A[i++]=B[j++];
                m++;
            }
        }
        while(j<n){
            A[i++]=B[j++];
        }
    }
}
