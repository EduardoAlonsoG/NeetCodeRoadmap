package problems.arraysandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> integerStory = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            //we first look for the current numbers's complement in the hash map
            //if we find it, we return their indexes
            int complement = target - nums[i];
            if(integerStory.containsKey(complement)){
                return new int[] {integerStory.get(complement) , i};
            }else{
                integerStory.put(nums[i] , i);
            }

        }
        return new int[]{0,0};
    }
}
