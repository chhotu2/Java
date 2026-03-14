 
import java.util.*;
class Solution {

    static List<String> list = new ArrayList<>();

    public String getHappyString(int n, int k) {

        list.clear(); // reset list
        generate("", n);

        if (k > list.size()) {
            return "";
        }

        return list.get(k - 1);
    }

    public void generate(String current, int n) {

        if (current.length() == n) {
            list.add(current);
            return;
        }

        char[] letters = {'a', 'b', 'c'};

        for (char ch : letters) {

            if (current.length() == 0 || current.charAt(current.length() - 1) != ch) {
                generate(current + ch, n);
            }

        }
    }
}