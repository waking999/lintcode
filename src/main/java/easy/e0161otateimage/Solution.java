package easy.e0161otateimage;

public class Solution {
    public void rotate(int[][] matrix) {
        // write your code here
        rotate(matrix,0,matrix.length-1);
    }


    private void rotate(int[][] matrix,int lt, int rb){
        if(rb-lt<1){
            return;
        }



        int n=rb-lt;
        for(int i=0;i<n;i++){
            int tmp=matrix[lt][lt+i];
            matrix[lt][lt+i]=matrix[rb-i][lt];
            matrix[rb-i][lt]=matrix[rb][rb-i];
            matrix[rb][rb-i]=matrix[lt+i][rb];
            matrix[lt+i][rb]=tmp;
        }


        rotate(matrix,lt+1,rb-1);
    }
}
