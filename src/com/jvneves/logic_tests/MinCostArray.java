package com.jvneves.logic_tests;

public class MinCostArray {
    public static void main(String[] args) {
        System.out.println(getMinimumCost(new int[]{1, 3, 5, 2, 10}));
    }


    public static int getMinimumCost(int[] arr) {
        // find neighbor has max difference
        int cost = 0;
        int max_cost = 0;
        int f_index = 0;
        int s_index = 0;

        // find max diff between neighbors
        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            int second = arr[i + 1];
            if (Math.abs(second - first) > max_cost) {
                max_cost = Math.abs(second - first);
                f_index = i;
                s_index = i + 1;
            }
        }

        // new number between the max diff
        int mid = (arr[f_index] + arr[s_index]) / 2;

        // add the cost
        cost += (arr[f_index] - mid) * (arr[f_index] - mid);
        cost += (arr[s_index] - mid) * (arr[s_index] - mid);

        // add the cost
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == f_index) {
                continue;
            }
            int first = arr[i];
            int second = arr[i + 1];
            cost += (first - second) * (first - second);
        }

        return cost;
    }
}
