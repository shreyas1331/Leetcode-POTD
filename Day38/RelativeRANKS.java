package Day38;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class RelativeRANKS {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        findRelativeRanks(arr);
    }

    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : score) {
            pq.add(num);
        }
        String[] arr = new String[score.length];
        HashMap<Integer, String> mp = new HashMap<>();

        mp.put(pq.poll(), "Gold Medal");
        mp.put(pq.poll(), "Silver Medal");
        mp.put(pq.poll(), "Bronze Medal");
        int rank = 4;
        while (!pq.isEmpty()) {
            mp.put(pq.poll(), String.valueOf(rank++));
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mp.get(score[i]);
        }
        return arr;
    }
}
