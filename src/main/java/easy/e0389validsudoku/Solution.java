package easy.e0389validsudoku;

import java.util.Arrays;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // write your code here
        int n = 9;

        //rows
        for (int i = 0; i < n; i++) {
            int[] count = new int[9];
            Arrays.fill(count, 0);
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.') {
                    int idx = board[i][j] - '0' - 1;
                    count[idx]++;
                    if (count[idx] > 1) {
                        return false;
                    }
                }
            }
        }


        //columns
        for (int j = 0; j < n; j++) {
            int[] count = new int[9];
            Arrays.fill(count, 0);
            for (int i = 0; i < n; i++) {
                if (board[i][j] != '.') {
                    int idx = board[i][j] - '0' - 1;
                    count[idx]++;
                    if (count[idx] > 1) {
                        return false;
                    }
                }
            }
        }



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //9  diagonals in each 3*3 block
                int[] count = new int[9];

                for (int x = 0; x < 3; x++) {
                    int p = i * 3 + x;
                    for (int y = 0; y < 3; y++) {
                        int q = j * 3 + y;
                        if (board[p][q] != '.') {
                            int idx = board[p][q] - '0' - 1;
                            count[idx]++;
                            if (count[idx] > 1) {
                                return false;
                            }
                        }

                    }
                }

                //9 *2 diagonals in each 3*3 block
                //left top -> right bottom
                int l = i * 3;
                int t = j * 3;
                if ((board[l][t] != '.' && board[l + 1][t + 1] != '.' && board[l][t] == board[l + 1][t + 1])
                        || (board[l][t] != '.' && board[l + 2][t + 2] != '.' && board[l][t] == board[l + 2][t + 2])
                        || (board[l + 1][t + 1] != '.' && board[l + 2][t + 2] != '.' && board[l + 1][t + 1] == board[l + 2][t + 2])
                ) {
                    return false;
                }
                //right top -> left bottom
                l = i * 3;
                t = j * 3 + 2;
                if ((board[l][t] != '.' && board[l + 1][t - 1] != '.' && board[l][t] == board[l + 1][t - 1])
                        || (board[l][t] != '.' && board[l + 2][t - 2] != '.' && board[l][t] == board[l + 2][t - 2])
                        || (board[l + 1][t - 1] != '.' && board[l + 2][t - 2] != '.' && board[l + 1][t - 1] == board[l + 2][t - 2])) {
                    return false;
                }
            }
        }

//        //2 diagonals in 9*9 block
//        //left top -> right bottom
//        int l=0;
//        int t=0;
//        int[] count=new int[9];
//        for(int x=0;x<9;x++){
//            if(board[l+x][t+x]!='.'){
//                int idx=board[l+x][t+x]-'0'-1;
//                count[idx]++;
//                if(count[idx]>1){
//                    return false;
//                }
//            }
//        }
//        //right top -> left bottom
//        l=0;
//        t=8;
//        count=new int[9];
//        for(int x=0;x<9;x++){
//            if(board[l+x][t-x]!='.'){
//                int idx=board[l+x][t-x]-'0'-1;
//                count[idx]++;
//                if(count[idx]>1){
//                    return false;
//                }
//            }
//        }


        return true;

    }
}
