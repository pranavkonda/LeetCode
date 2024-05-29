import java.util.HashMap;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String final_result = "";
        Arrays.sort(strs);
        String compare1 = strs[0];
        String compare2 = strs[strs.length - 1];
        for (int i = 0; i < compare1.length(); i++) {
            if (compare1.charAt(i) == compare2.charAt(i)) {
                final_result = final_result + compare1.charAt(i);
            } else {
                break;
            }
        }
    
        return final_result;
    }
}