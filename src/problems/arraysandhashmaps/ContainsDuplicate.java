package problems.arraysandhashmaps;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> intStory = new HashSet<Integer>();
        for (int n : nums){
            if (!intStory.add(n)) return true;
        }
        return false;
    }
}
