import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            int current = map.get(temp);
            if (i != 0) {
                if (s.charAt(i - 1) == 'I') {
                    if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                        current = current - 1;
                        i--;
                    }
                } else if (s.charAt(i - 1) == 'X') {
                    if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
                        current = current - 10;
                        i--;
                    }
                } else if (s.charAt(i - 1) == 'C') {
                    if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                        current = current - 100;
                        i--;
                    }
                }
            }
            total += current;
        }
        return total;
    }
}