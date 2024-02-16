import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Map.Entry.comparingByValue());

        for (Map.Entry<Integer, Integer> e : entryList) {
            if (e.getValue() <= k) {
                k -= e.getValue();
                map.remove(e.getKey());
            } else {
                break;
            }
        }

        return map.size();
    }
}
