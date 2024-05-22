import java.util.*;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       
        HashSet<List<Integer>> set = new HashSet<>();
        
       
        set.add(new ArrayList<>());
        
        generateSubsets(nums, 0, new ArrayList<>(), set);
        
        return new ArrayList<>(set);
    }
    
    private void generateSubsets(int[] nums, int index, List<Integer> current, HashSet<List<Integer>> set) {
        if (index == nums.length) {
            set.add(new ArrayList<>(current));
            return;
        }
        
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, set);
        current.remove(current.size()-1);
        generateSubsets(nums, index + 1, current, set);
       
        
    }
    
    
}
