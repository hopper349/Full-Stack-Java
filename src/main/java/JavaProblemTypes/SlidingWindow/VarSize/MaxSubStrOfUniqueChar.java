package JavaProblemTypes.SlidingWindow.VarSize;


//int str = aabacbebebe
//int k = 3 unique characters
// find max sub str which contains 3 unique characters


//b=2
//        c=1
//        e=1

import java.util.HashMap;
import java.util.HashSet;

public class MaxSubStrOfUniqueChar {

    public int findMaxSubStr(String str, int k) {

        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int mapSize = 0;

        while (j < str.length()) {
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

            if (map.keySet().size() < k) {
                j++;
            } else if (map.keySet().size() == k) {
                if (j - i + 1 > max)
                    max = j - i + 1;
                j++;
            } else {
                while (map.keySet().size() > k) {

                    map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
                    if (map.get(str.charAt(i)) == 0) {
                        map.remove(str.charAt(i));
                    }
                    i++;
                }
            }
        }

        return max;
    }

    public int bruteForce(String str, int k) {
        HashMap<Character, Integer> map = new HashMap();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                map.put(str.charAt(i), map.getOrDefault(str.charAt(j), 0) + 1);

                if (map.keySet().size() == k) {
                    if (j - i +1 > max) {
                        max = j - i;
                    }
                } else if (map.keySet().size() > k) {

                    while (map.keySet().size() > k) {
                        map.put(str.charAt(i), map.get(str.charAt(i)) - 1);

                        if (map.get(str.charAt(i)) == 0) {
                            map.remove(str.charAt(i));
                        }
                        i++;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubStrOfUniqueChar m = new MaxSubStrOfUniqueChar();

        System.out.println(m.findMaxSubStr("aaaaabbacbebebebb", 3));
        System.out.println(m.bruteForce("aaaaabbacbebebebb", 3));

    }
}
