package JavaProblemTypes.SlidingWindow.FixedSize;

//"aababaabababa", "aaba"
public class AnaP1 {

    private int findAnagramsBF(String str, String searchStr) {

        int ans = 0;

        for (int i = 0; i < str.length() - searchStr.length(); i++) {
            String sub = str.substring(i, i + searchStr.length());
            for (char c : searchStr.toCharArray()) {
                if (sub.contains(String.valueOf(c))) {
                    sub = sub.replaceFirst(String.valueOf(c), "");
                }
            }
            if (sub.isEmpty()) {
                ans++;
            }
        }
        return ans;
    }


    private int findAnagramsSlidingWindow(String str, String searchStr) {

        int ans = 0;
        int i = 0;
        int j = 0;
        String sub = "";

        while (j < str.length()) {
            sub+=str.charAt(j);

            if(j-i+1< searchStr.length()){
                j++;
            }
            else if(j-i+1 == searchStr.length()){
                String temp= sub;
                for (char c : searchStr.toCharArray()) {
                    if (temp.contains(String.valueOf(c))) {
                        temp = temp.replaceFirst(String.valueOf(c), "");
                    }
                }
                if (temp.isEmpty()) {
                    ans++;
                }
                sub= sub.replaceFirst(String.valueOf(str.charAt(i)),"");
                i++;
                j++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        AnaP1 anagram = new AnaP1();
        System.out.println(anagram.findAnagramsSlidingWindow("maap pam apm map paam mapa mapa", "map"));
    }
}
