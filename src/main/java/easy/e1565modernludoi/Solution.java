package easy.e1565modernludoi;

public class Solution {
    public int modernLudo(int length, int[][] connections) {
        // Write your code here
        if(length<=6){
            return 1;
        }

        int len=connections.length;

        minCount=0;
        minCount=Integer.MAX_VALUE;
        dfs(connections,1,length,0);
        return minCount;


    }
    private int minCount;
    private void dfs(int[][] connections,int pos,int length,int count){
        if(count>=minCount||pos>length){
            return;
        }
        if(pos==length){
            minCount= count;
            return;
        }
//        //jump from current position;
//        int newPos=findB(connections,pos);
//        dfs(connections,newPos,length,count);

        //jump from current position+dic;
        for(int i=1;i<=6;i++){
            int newPos=pos+i;
            if(newPos>length){
                break;
            }
            newPos=findB(connections,newPos);
            dfs(connections,newPos,length,count+1);
        }

    }

    private int findB(int[][] connections,int a){
        for (int[] conn : connections) {
            if (a == conn[0]) {
                return conn[1];
            }
        }
        return a;

    }
}
