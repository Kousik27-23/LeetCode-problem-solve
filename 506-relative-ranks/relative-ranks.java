import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rank = n - i;
            int value = sorted[i];

            if (rank == 1) {
                map.put(value, "Gold Medal");
            } else if (rank == 2) {
                map.put(value, "Silver Medal");
            } else if (rank == 3) {
                map.put(value, "Bronze Medal");
            } else {
                map.put(value, String.valueOf(rank));
            }
        }

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }
}