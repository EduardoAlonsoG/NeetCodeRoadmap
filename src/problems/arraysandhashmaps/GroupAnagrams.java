package problems.arraysandhashmaps;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> conteinedStrings = new HashMap<>();
        for(String singleStr : strs){
            String sortedVersion = sortString(singleStr);
            List<String> groupedStrings = conteinedStrings.getOrDefault(sortedVersion, new ArrayList<>());
            groupedStrings.add(singleStr);
            conteinedStrings.put(sortedVersion, groupedStrings);
        }
        return new ArrayList<>(conteinedStrings.values());
    }

    private String sortString(String str){
        char[] stringChars = str.toCharArray();
        Arrays.sort(stringChars);
        return Arrays.toString(stringChars);
    }
}
