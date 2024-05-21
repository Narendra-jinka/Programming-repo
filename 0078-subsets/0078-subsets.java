import java.util.*;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Use a HashSet to avoid duplicate subsets
        HashSet<List<Integer>> set = new HashSet<>();
        
        // Add the empty subset
        set.add(new ArrayList<>());
        
        // Generate subsets
        generateSubsets(nums, 0, new ArrayList<>(), set);
        
        // Convert the HashSet to a List and return
        return new ArrayList<>(set);
    }
    
    private void generateSubsets(int[] nums, int index, List<Integer> current, HashSet<List<Integer>> set) {
        if (index == nums.length) {
            return;
        }
        
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            set.add(new ArrayList<>(current));
            generateSubsets(nums, i + 1, current, set);
            current.remove(current.size() - 1); // Backtrack
        }
    }
    
    
}
