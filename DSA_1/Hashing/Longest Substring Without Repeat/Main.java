// Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length of the longest substring that contains no repeating characters. The greater the length of this unique-character substring, the higher the "GOOD"ness of the string.

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxLengthSubstring("abcabcbb"));
        System.out.println(maxLengthSubstring("AaaA"));
    }

    private static int maxLengthSubstring(String A) {
        int maxLength = 0, start = 0;
        HashMap<Character, Integer> lastIndexHashMap = new HashMap<>();
        // System.out.println(A);
        for(int end=0; end<A.length(); end++) {
            if(lastIndexHashMap.containsKey(A.charAt(end))) {
                start = Math.max(start, lastIndexHashMap.get(A.charAt(end))+1);
            }
            lastIndexHashMap.put(A.charAt(end), end);
            // System.out.println(start + " " + end);
            // System.out.println(lastIndexHashMap);
            maxLength = Math.max(maxLength, (end-start));
        }
        return maxLength+1;
    }
}
