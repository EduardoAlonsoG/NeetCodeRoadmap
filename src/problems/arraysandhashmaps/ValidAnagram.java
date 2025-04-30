package problems.arraysandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character , Integer> charInformation = new HashMap<Character, Integer>();
        int inputSize = s.length();
        if(t.length() != inputSize) return false; //not the same size then not valid anagram

        //fill the hash map
        for(int pointer = 0 ; pointer < inputSize; pointer++){
            char currInS = s.charAt(pointer);
            char currInT = t.charAt(pointer);
            charInformation.put(
                    currInS ,
                    charInformation.getOrDefault(currInS , 0) + 1
            );

            charInformation.put(
                    currInT ,
                    charInformation.getOrDefault(currInT , 0) - 1
            );
        }
        //Check if character in S minus character in T == 0
        for (Character ch : charInformation.keySet()){
            if(charInformation.get(ch) != 0) return false;
        }

        return true;
    }
}
