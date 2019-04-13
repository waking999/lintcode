package medium.m1029cheapestflightswithinkstops;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // write your code here
        Node[] cities = new Node[n];
        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int p = flight[2];
            if (cities[u] == null) {
                cities[u] = new Node();
            }

            List<Integer> children = cities[u].children;
            children.add(v);
            List<Integer> prices = cities[u].prices;
            prices.add(p);
        }

        min = Integer.MAX_VALUE;

        dfs(cities, src, dst, -1, 0, K);
        return min==Integer.MAX_VALUE ? -1 : min;
    }

    private boolean found;
    private int min;


    private void dfs(Node[] cities, int src, int dst, int stops, int totalprice, int K) {
        if (stops >K) {
            return;
        }

        if (src == dst) {
            min = min < totalprice ? min : totalprice;
            return;
        }

        Node u = cities[src];
        List<Integer> children = u.children;
        List<Integer> prices = u.prices;

        int len = children.size();
        for (int i = 0; i < len; i++) {
            int newSrc = children.get(i);
            int price = prices.get(i);
            dfs(cities, newSrc, dst, stops + 1, totalprice + price, K);
        }
    }


    private class Node {

        List<Integer> children;
        List<Integer> prices;

        Node() {
            children = new ArrayList<>();
            prices = new ArrayList<>();
        }

    }
}
