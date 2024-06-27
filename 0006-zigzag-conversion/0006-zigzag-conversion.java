class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int[] ordering = new int[s.length()];
        int pairing = 1;
        String finalS = "";
        Boolean rising = true;
        for (int i = 0; i < s.length(); i++) {
            if (pairing == numRows) {
                rising = false; 
            } else if (pairing == 1) {
                rising = true;
            }
            ordering[i] = pairing;
            if (rising) {
            pairing++;
            } else {
            pairing--;    
            }
        }
        
        for (int j = 0; j < numRows; j++) {
            for (int k = 0; k < s.length(); k++) {
               if (ordering[k] == j+1) {
                   finalS = finalS + s.charAt(k);
               } 
            }
        }
        return finalS;
    }
}