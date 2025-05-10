package problems.arraysandhashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        List<Integer>[] orderedFrequencies = new List[nums.length + 1];
        Map<Integer, Integer> numRepetition = new HashMap<>();
        //fill the map with the frequencies of each number
        for(int number : nums){
            numRepetition.put(
                    number,
                    numRepetition.getOrDefault(number, 0) + 1
            );
        }
        for(int i = 0; i < orderedFrequencies.length ; i++){
            orderedFrequencies[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : numRepetition.entrySet()){
            orderedFrequencies[entry.getValue()].add(entry.getKey());
        }
        int counter = 0;
        for(int i = orderedFrequencies.length - 1; i > 0 && counter < k ; i--){
            for(int numFound : orderedFrequencies[i]){
                result[counter] = numFound;
                counter++;
                if (counter == k) return result;
            }
        }

        return result;
    }
}
