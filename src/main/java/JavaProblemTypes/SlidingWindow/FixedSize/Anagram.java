package JavaProblemTypes.SlidingWindow.FixedSize;


//Find the num of occurrences of anagrams

import java.util.HashMap;

public class Anagram {


    public int findAnagramsCount(String big, String searchText) {
        int i = 0;
        int j = 0;

        HashMap<Character, Integer> map = getCharCount(searchText);
        String str = "";
        int count = map.size();
        int anagramCount = 0;

        while (j < big.length()) {
            if (map.containsKey(big.charAt(j))) {
                map.put(big.charAt(j), map.get(big.charAt(j)) - 1);
            }
            if (map.get(big.charAt(j)) == 0) {
                count--;
            }
            if (j - i + 1 < searchText.length()) {
                j++;
            } else if (j - i + 1 == searchText.length()) {
                if (count == 0) {
                    anagramCount++;
                }
                if (map.containsKey(big.charAt(i))) {
                    map.put(big.charAt(i), map.get(big.charAt(i)) + 1);
                    if (map.get(big.charAt(i)) > 0) {
                        count++;
                    }
                    else if(map.get(big.charAt(i)) ==0){
                        count--;
                    }
                }
                i++;
                j++;
            }
        }
        return anagramCount;
    }

    public HashMap<Character, Integer> getCharCount(String searchText) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int k = 0; k < searchText.length(); k++) {
            if (count.containsKey(searchText.charAt(k))) {
                int counter = count.get(searchText.charAt(k)) + 1;
                count.put(searchText.charAt(k), counter);
            } else {
                count.put(searchText.charAt(k), 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.findAnagramsCount("map pam apm map paam mapa mapa", "map"));
    }
}
//a=1
//b=0
//counter=1
//anagram=1