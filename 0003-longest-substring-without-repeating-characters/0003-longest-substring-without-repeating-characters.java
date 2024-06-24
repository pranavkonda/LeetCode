class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> stringMap = new HashMap<>();
        int counter = 0;
        int finalCounter = 0;
        int i = 0;
        while (i < s.length()) {
           Character index = s.charAt(i);
           if (stringMap.containsKey(index)) {
               int newIndex = stringMap.get(index) + 1;
               stringMap.clear();
               //stringMap.put(index, i);
               if (counter > finalCounter){
                finalCounter = counter;  
               }
               counter = 0;
               i = newIndex;
           }
           else {
               counter++;
               stringMap.put(index, i);
               i++;
           }
       }
        if (finalCounter == 0 || counter > finalCounter) {
            finalCounter = counter;
        }
        return finalCounter;
    }
    
}