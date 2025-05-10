package problems.arraysandhashmaps;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbersRegister = new HashSet<>();
        for(int num : nums){
            numbersRegister.add(num);
        }
        int maxConse = 0;
        for(int current : nums){
            int consecutive = 0;
            int initialNumber = current;
            while(numbersRegister.contains(initialNumber)){
                consecutive++;
                initialNumber++;
            }
            maxConse = Math.max(maxConse , consecutive);
        }
        return maxConse;
    }
}
